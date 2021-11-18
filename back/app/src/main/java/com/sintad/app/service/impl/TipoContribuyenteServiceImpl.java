package com.sintad.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sintad.app.converter.TipoContribuyenteConverter;
import com.sintad.app.entity.TipoContribuyenteEntity;
import com.sintad.app.exception.NotFoundException;
import com.sintad.app.repository.TipoContribuyenteRepository;
import com.sintad.app.service.ITipoContribuyenteService;
import com.sintad.app.vo.DataVO;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;

@Service
public class TipoContribuyenteServiceImpl implements ITipoContribuyenteService{
	
	@Autowired
	private TipoContribuyenteRepository tipoContribuyenteRepository;

	@Override
	@Transactional(readOnly = true)
	public ResponseVO<TipoContribuyenteVo> getTipoContribuyente(int id) throws Exception{
		
		ResponseVO<TipoContribuyenteVo> res = new ResponseVO<TipoContribuyenteVo>();
		
		TipoContribuyenteVo vo = TipoContribuyenteConverter.tipoContribuyenteEntityToVo(tipoContribuyenteRepository.findById(id).orElseThrow(() -> {
			throw new NotFoundException("No se ha encontrado el tipo de contribuyente con código " + id);
		}));

		
		DataVO<TipoContribuyenteVo> d = new DataVO<TipoContribuyenteVo>();
		d.setObjects(vo);
		res.setData(d);

		return res;
		
	}

	@Override
	public ResponseVO<TipoContribuyenteVo> createTipoContribuyente(TipoContribuyenteVo tipoContribuyente)
			throws Exception {
		
		ResponseVO<TipoContribuyenteVo> res = new ResponseVO<TipoContribuyenteVo>();
		TipoContribuyenteEntity entity = TipoContribuyenteConverter.tipoContribuyenteVoToEntity(tipoContribuyente);


		if (entity.getNombre() == null || entity.getNombre().equalsIgnoreCase("")) {
			
			throw new NotFoundException("El nombre no puede ser nulo");
			
		} else {
				
				TipoContribuyenteVo vo = TipoContribuyenteConverter.tipoContribuyenteEntityToVo(tipoContribuyenteRepository.save(entity));
				
	    		DataVO<TipoContribuyenteVo> d = new DataVO<TipoContribuyenteVo>();
	    		d.setObjects(vo);
	    		res.setData(d);
	    		
				return res;
		}
	}
	
	
	
	
	
}
