package com.sintad.app.converter;

import java.util.LinkedList;
import java.util.List;

import com.sintad.app.entity.UserEntity;
import com.sintad.app.vo.UserVo;



public class UserConverter {

	public static UserVo userEntityToVo(UserEntity entity) {
		if (entity == null)
			return null;
		
		UserVo vo = new UserVo();
		vo.setId(entity.getId());
		vo.setUsername(entity.getUsername());
		vo.setName(entity.getName());
		vo.setPassword(entity.getPassword());
	
		
		return vo;
	}

	public static List<UserVo> userEntityToVo(Iterable<UserEntity> entities) {
		if (entities == null)
			return null;

		List<UserVo> ret = new LinkedList<>();
		for (UserEntity entity : entities) {
			ret.add(UserConverter.userEntityToVo(entity));
		}
		return ret;
	}

	public static UserEntity userVoToEntity(UserVo vo) {
		if (vo == null)
			return null;

		UserEntity entity = new UserEntity();
		entity.setId(vo.getId());
		entity.setUsername(vo.getUsername());
		entity.setName(vo.getName());
		entity.setPassword(vo.getPassword());
		
		return entity;
	}

	public static List<UserEntity> userVoToEntity(Iterable<UserVo> vos) {
		if (vos == null)
			return null;

		List<UserEntity> ret = new LinkedList<>();
		for (UserVo vo : vos) {
			ret.add(UserConverter.userVoToEntity(vo));
		}
		return ret;
	}
	
}
