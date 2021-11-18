package com.sintad.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sintad.app.entity.EntidadEntity;
import com.sintad.app.entity.TipoContribuyenteEntity;
import com.sintad.app.repository.TipoContribuyenteRepository;
import com.sintad.app.service.ITipoContribuyenteService;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;

@RestController
@RequestMapping("/api")
public class TipoContribuyenteController {
	
	@Autowired
	private ITipoContribuyenteService contribuyenteService;
	
	@GetMapping("/tipo_contribuyente/{id}")
	public ResponseVO<TipoContribuyenteVo> getTipoContribuyentes(@PathVariable int id) throws Exception {
		return contribuyenteService.getTipoContribuyente(id);
	}
	
	@PostMapping("/tipo_contribuyentes/store")
	public ResponseVO<TipoContribuyenteVo> createTipoContribuyente(@RequestBody TipoContribuyenteVo tipoContribuyente) throws Exception {
		
		return contribuyenteService.createTipoContribuyente(tipoContribuyente);
		
	}
	
	
	@Autowired
	private TipoContribuyenteRepository respositorio;
	
	@GetMapping("/tipo_contribuyente/{id}/entidades")
	public List<EntidadEntity> getEntidades(@PathVariable int id) throws Exception {
	
		return respositorio.getById(id).getEntidades();
		
	}
}
