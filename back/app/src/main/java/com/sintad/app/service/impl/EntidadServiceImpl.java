package com.sintad.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sintad.app.converter.EntidadConverter;
import com.sintad.app.converter.TipoContribuyenteConverter;
import com.sintad.app.converter.TipoDocumentoConverter;
import com.sintad.app.entity.EntidadEntity;
import com.sintad.app.exception.NotFoundException;
import com.sintad.app.repository.EntidadRepository;
import com.sintad.app.service.IEntidadService;
import com.sintad.app.vo.DataVO;
import com.sintad.app.vo.EntidadVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;
import com.sintad.app.vo.TipoDocumentoVo;

@Service
public class EntidadServiceImpl implements IEntidadService{

	@Autowired
	private EntidadRepository entidadRepository;
	
	@Override
	public ResponseVO<EntidadVo> getEntidad(int id) throws Exception {
		// TODO Auto-generated method stub
		ResponseVO<EntidadVo> res = new ResponseVO<EntidadVo>();
		
		EntidadVo vo = EntidadConverter.entidadEntityToVo(entidadRepository.findById(id).orElseThrow(() -> {
			throw new NotFoundException("No se ha encontrado la entidad con código " + id);
		}));

		
		DataVO<EntidadVo> d = new DataVO<EntidadVo>();
		d.setObjects(vo);
		res.setData(d);

		return res;
	}

	@Override
	public ResponseVO<TipoContribuyenteVo> getTipoContribuyente(int id) throws Exception {
		// TODO Auto-generated method stub
		ResponseVO<TipoContribuyenteVo> res = new ResponseVO<TipoContribuyenteVo>();
		System.out.println(id);
		if(entidadRepository.findById(id)==null){
			throw new NotFoundException("No se ha encontrado la entidad con código " + id);
		}
		
		TipoContribuyenteVo vo=TipoContribuyenteConverter.tipoContribuyenteEntityToVo(entidadRepository.findById(id).get().getTipoContribuyente());
		
		
		DataVO<TipoContribuyenteVo> d = new DataVO<TipoContribuyenteVo>();
		d.setObjects(vo);
		res.setData(d);

		return res;
	}

	@Override
	public ResponseVO<List<EntidadVo>> getEntidades() throws Exception {
		// TODO Auto-generated method stub
		ResponseVO<List<EntidadVo>> res = new ResponseVO<List<EntidadVo>>();
		
		List<EntidadVo> vos = EntidadConverter.entidadEntityToVo(entidadRepository.findAll());

		
		DataVO<List<EntidadVo>> d = new DataVO<List<EntidadVo>>();
		d.setObjects(vos);
		res.setData(d);

		return res;
	}

	@Override
	public ResponseVO<TipoDocumentoVo> getTipoDocumento(int id) {
		// TODO Auto-generated method stub
		ResponseVO<TipoDocumentoVo> res = new ResponseVO<TipoDocumentoVo>();
		
		if(entidadRepository.findById(id)==null){
			throw new NotFoundException("No se ha encontrado la entidad con código " + id);
		}
		
		TipoDocumentoVo vo=TipoDocumentoConverter.tipoDocumentoEntityToVo(entidadRepository.findById(id).get().getTipoDocumento());
		
		
		DataVO<TipoDocumentoVo> d = new DataVO<TipoDocumentoVo>();
		d.setObjects(vo);
		res.setData(d);

		return res;
	}

	@Override
	public void deleteEntidad(int id) throws Exception {
		// TODO Auto-generated method stub
		EntidadEntity entidad=entidadRepository.findById(id).orElseThrow(() -> {
			throw new NotFoundException("No se ha encontrado la entidad con código " + id);
		});
		
		entidadRepository.delete(entidad);
	}

}
