package com.sintad.app.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;
import com.sintad.app.auth.SecurityConstants;
import com.sintad.app.converter.UserConverter;
import com.sintad.app.entity.UserEntity;
import com.sintad.app.exception.NotFoundException;
import com.sintad.app.repository.UserRepository;
import com.sintad.app.service.IUserService;
import com.sintad.app.vo.DataVO;
import com.sintad.app.vo.LoginVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.UserVo;
import com.sintad.app.vo.UserWrapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public ResponseVO<UserWrapper> createUser(UserVo user) throws Exception {
		// TODO Auto-generated method stub
		ResponseVO<UserWrapper> res = new ResponseVO<UserWrapper>();
		UserEntity entity = UserConverter.userVoToEntity(user);
		
		if(entity.getUsername().equalsIgnoreCase("") || entity.getUsername() == null) {
			throw new NotFoundException("El nombre de usuario no puede ser nulo");
		}else {
			Optional<UserEntity> userOptional = userRepository.findByUsername(entity.getUsername());
			
			if(userOptional.isPresent()) {
				throw new NotFoundException("Ya existe un usuario con ese username");
			}
				
				UserVo vo=UserConverter.userEntityToVo(userRepository.save(entity));
				
				UserWrapper wp=new UserWrapper(vo,this.getJWTToken(entity.getUsername()));
				
				DataVO<UserWrapper> d=new DataVO<UserWrapper>();
				
				d.setObjects(wp);
			
			
				res.setData(d);
			
		}
		
		return res;
	}
	
	private String getJWTToken(String username) {
		String secretKey = SecurityConstants.SECRET;
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return SecurityConstants.PREFIX + token;
	}

	private String getUserNameFromJwtToken(String token) throws Exception{
	    return Jwts.parser().setSigningKey(SecurityConstants.SECRET.getBytes()).parseClaimsJws(token).getBody().getSubject();
	}
	
	@Override
	public ResponseVO<UserWrapper> findByUsernameAndPassword(LoginVo loginUser) {
		// TODO Auto-generated method stub
		
		ResponseVO<UserWrapper> res = new ResponseVO<UserWrapper>();
		
		
		
		if(loginUser.getUsername().equalsIgnoreCase("") || loginUser.getUsername() == null || loginUser.getPassword()==null) {
			throw new NotFoundException("Usuario o contraseña inválidosss");
		}else {
			Optional<UserEntity> userOptional = userRepository.findByUsername(loginUser.getUsername());
			
			
			if(!userOptional.isPresent() || !userOptional.get().getPassword().equals(loginUser.getPassword())) {
				throw new NotFoundException("Usuario o contraseña inválidos");
			}
				
			UserVo vo=UserConverter.userEntityToVo(userOptional.get());
			
			UserWrapper wp=new UserWrapper(vo,this.getJWTToken(loginUser.getUsername()));
			
			DataVO<UserWrapper> d=new DataVO<UserWrapper>();
			
			d.setObjects(wp);

			res.setData(d);
			
		}
		
		return res;
	}

	@Override
	public ResponseVO<UserWrapper> refresh(String token) throws Exception {
		// TODO Auto-generated method stub
		String usuario="";
		ResponseVO<UserWrapper> res = new ResponseVO<UserWrapper>();

		try {
			usuario=getUserNameFromJwtToken(token);
			
			
			UserVo vo=UserConverter.userEntityToVo(userRepository.findByUsername(usuario).get());
			
			UserWrapper wp=new UserWrapper(vo,this.getJWTToken(usuario));
			
			DataVO<UserWrapper> d=new DataVO<UserWrapper>();
			
			d.setObjects(wp);
		
			res.setData(d);
			
			
		}catch(Exception e) {
			throw new NotFoundException("Token ha expirado");
		}
		
		
		return res;
	}
	
	@Override
	public ResponseVO<UserVo> updateUser(UserVo user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO<UserVo> getUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	




}
