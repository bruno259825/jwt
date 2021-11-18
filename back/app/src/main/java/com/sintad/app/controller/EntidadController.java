package com.sintad.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sintad.app.entity.EntidadEntity;
import com.sintad.app.entity.TipoContribuyenteEntity;
import com.sintad.app.repository.EntidadRepository;
import com.sintad.app.service.IEntidadService;
import com.sintad.app.vo.EntidadVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;
import com.sintad.app.vo.TipoDocumentoVo;

@RestController
@RequestMapping("/api")
public class EntidadController {
	
	@Autowired
	private IEntidadService entidadService;
	
	@GetMapping("/entidad/{id}")
	public ResponseVO<EntidadVo> getEntidad(@PathVariable int id) throws Exception {
		
		return entidadService.getEntidad(id);
		
	}
	
	@GetMapping("/entidades")
	public ResponseVO<List<EntidadVo>> getEntidades() throws Exception {
		
		return entidadService.getEntidades();
		
	}
	
	@DeleteMapping("/entidades/{id}")
	public void deleteEntidad(@PathVariable int id) throws Exception {
		entidadService.deleteEntidad(id);
	}
	
	@GetMapping("/entidad/{id}/tipo_contribuyente")
	public ResponseVO<TipoContribuyenteVo> getTipoContribuyente(@PathVariable int id) throws Exception {
		return entidadService.getTipoContribuyente(id);
	}
	
	@GetMapping("/entidad/{id}/tipo_documento")
	public ResponseVO<TipoDocumentoVo> getTipoDocumento(@PathVariable int id) throws Exception {
		return entidadService.getTipoDocumento(id);
	}
	
}
