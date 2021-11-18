package com.sintad.app.converter;
import com.sintad.app.entity.TipoContribuyenteEntity;
import com.sintad.app.vo.TipoContribuyenteVo;
import java.util.LinkedList;
import java.util.List;

public class TipoContribuyenteConverter {
	
	public static TipoContribuyenteVo tipoContribuyenteEntityToVo(TipoContribuyenteEntity entity) {
		
		if (entity == null)
			return null;
		
		TipoContribuyenteVo vo = new TipoContribuyenteVo();
		vo.setId(entity.getId());
		vo.setEstado(entity.getEstado());
		vo.setNombre(entity.getNombre());
		vo.setEntidades(entity.getEntidades());
		
		return vo;
	}

	public static List<TipoContribuyenteVo> tipoContribuyenteEntityToVo(Iterable<TipoContribuyenteEntity> entities) {
		if (entities == null)
			return null;

		List<TipoContribuyenteVo> ret = new LinkedList<>();
		for (TipoContribuyenteEntity entity : entities) {
			ret.add(TipoContribuyenteConverter.tipoContribuyenteEntityToVo(entity));
		}
		return ret;
	}
	
	public static TipoContribuyenteEntity tipoContribuyenteVoToEntity(TipoContribuyenteVo vo) {
		if (vo == null)
			return null;

		TipoContribuyenteEntity entity = new TipoContribuyenteEntity();
		entity.setId(vo.getId());
		entity.setEstado(vo.getEstado());
		entity.setNombre(vo.getNombre());
		entity.setEntidades(vo.getEntidades());
		
		return entity;
	}
	
	public static List<TipoContribuyenteEntity> tipoContribuyenteVoToEntity(Iterable<TipoContribuyenteVo> vos) {
		if (vos == null)
			return null;

		List<TipoContribuyenteEntity> ret = new LinkedList<>();
		for (TipoContribuyenteVo vo : vos) {
			ret.add(TipoContribuyenteConverter.tipoContribuyenteVoToEntity(vo));
		}
		return ret;
	}

}





