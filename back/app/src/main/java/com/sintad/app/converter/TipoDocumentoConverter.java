package com.sintad.app.converter;

import java.util.LinkedList;
import java.util.List;

import com.sintad.app.entity.TipoContribuyenteEntity;
import com.sintad.app.entity.TipoDocumentoEntity;
import com.sintad.app.vo.TipoContribuyenteVo;
import com.sintad.app.vo.TipoDocumentoVo;

public class TipoDocumentoConverter {

	public static TipoDocumentoVo tipoDocumentoEntityToVo(TipoDocumentoEntity entity) {
		
		if (entity == null)
			return null;
		
		TipoDocumentoVo vo = new TipoDocumentoVo();
		vo.setId(entity.getId());
		vo.setEstado(entity.getEstado());
		vo.setNombre(entity.getNombre());
		vo.setCodigo(entity.getCodigo());
		vo.setDescripcion(entity.getDescripcion());
		vo.setEntidades(entity.getEntidades());
		
		return vo;
	}

	public static List<TipoDocumentoVo> tipoDocumentoEntityToVo(Iterable<TipoDocumentoEntity> entities) {
		if (entities == null)
			return null;

		List<TipoDocumentoVo> ret = new LinkedList<>();
		for (TipoDocumentoEntity entity : entities) {
			ret.add(TipoDocumentoConverter.tipoDocumentoEntityToVo(entity));
		}
		return ret;
	}
	
	public static TipoDocumentoEntity tipoDocumentoVoToEntity(TipoDocumentoVo vo) {
		if (vo == null)
			return null;

		TipoDocumentoEntity entity = new TipoDocumentoEntity();
		entity.setId(vo.getId());
		entity.setEstado(vo.getEstado());
		entity.setNombre(vo.getNombre());
		entity.setCodigo(vo.getCodigo());
		entity.setDescripcion(vo.getDescripcion());
		entity.setEntidades(vo.getEntidades());
		
		return entity;
	}
	
	public static List<TipoDocumentoEntity> tipoDocumentoVoToEntity(Iterable<TipoDocumentoVo> vos) {
		if (vos == null)
			return null;

		List<TipoDocumentoEntity> ret = new LinkedList<>();
		for (TipoDocumentoVo vo : vos) {
			ret.add(TipoDocumentoConverter.tipoDocumentoVoToEntity(vo));
		}
		return ret;
	}
	
}
