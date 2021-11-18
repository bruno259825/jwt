package com.sintad.app.service;

import com.sintad.app.entity.UserEntity;
import com.sintad.app.vo.LoginVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.UserVo;
import com.sintad.app.vo.UserWrapper;

public interface IUserService {

	public ResponseVO<UserWrapper> createUser(UserVo user) throws Exception;
	 
	public ResponseVO<UserVo> updateUser(UserVo user) throws Exception;
	
	public ResponseVO<UserVo> getUser(Long id) throws Exception;
	

	public ResponseVO<UserWrapper> findByUsernameAndPassword(LoginVo loginUser) throws Exception;

	public ResponseVO<UserWrapper> refresh(String token) throws Exception;

	
}
