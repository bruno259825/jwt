package com.sintad.app.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sintad.app.entity.UserEntity;
import com.sintad.app.repository.UserRepository;
import com.sintad.app.service.IUserService;
import com.sintad.app.vo.LoginVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.UserVo;
import com.sintad.app.vo.UserWrapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private IUserService userService;
	
	
	@PostMapping("/usuarios")
	public ResponseVO<UserWrapper> saveUser(@RequestBody UserVo newUser) throws Exception { 
		
		return userService.createUser(newUser);
	}
	
	
	@PostMapping("/login")
	public ResponseVO<UserWrapper> login(@RequestBody LoginVo loginUser) throws Exception { 
		 
		return userService.findByUsernameAndPassword(loginUser);
	}
	
	
	@PostMapping("/refrescar")
	public ResponseVO<UserWrapper> refresh(@RequestHeader("Authorization") String token) throws Exception { 
		
		return userService.refresh(token);
		
	}
	
}
