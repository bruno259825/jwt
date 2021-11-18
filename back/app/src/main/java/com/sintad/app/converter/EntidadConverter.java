package com.sintad.app.converter;

import java.util.LinkedList;
import java.util.List;

import com.sintad.app.entity.EntidadEntity;
import com.sintad.app.vo.EntidadVo;

public class EntidadConverter {
	
	public static EntidadVo entidadEntityToVo(EntidadEntity entity) {
		
		if (entity == null)
			return null;
		
		EntidadVo vo = new EntidadVo();
		vo.setId(entity.getId());
		vo.setEstado(entity.getEstado());
		vo.setDireccion(entity.getDireccion());
		vo.setNombre_comercial(entity.getNombre_comercial());
		vo.setNro_documento(entity.getNro_documento());
		vo.setRazon_social(entity.getRazon_social());
		vo.setTelefono(entity.getTelefono());

		return vo;
	}

	public static List<EntidadVo> entidadEntityToVo(Iterable<EntidadEntity> entities) {
		if (entities == null)
			return null;

		List<EntidadVo> ret = new LinkedList<>();
		for (EntidadEntity entity : entities) {
			ret.add(EntidadConverter.entidadEntityToVo(entity));
		}
		return ret;
	}
	
	public static EntidadEntity entidadVoToEntity(EntidadVo vo) {
		if (vo == null)
			return null;

		EntidadEntity entity = new EntidadEntity();
		entity.setId(vo.getId());
		entity.setEstado(vo.getEstado());
		entity.setDireccion(vo.getDireccion());
		entity.setNombre_comercial(vo.getNombre_comercial());
		entity.setNro_documento(vo.getNro_documento());
		entity.setRazon_social(vo.getRazon_social());
		entity.setTelefono(vo.getTelefono());
		
		return entity;
	}
	
	public static List<EntidadEntity> entidadVoToEntity(Iterable<EntidadVo> vos) {
		if (vos == null)
			return null;

		List<EntidadEntity> ret = new LinkedList<>();
		for (EntidadVo vo : vos) {
			ret.add(EntidadConverter.entidadVoToEntity(vo));
		}
		return ret;
	}
}
