package com.sintad.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sintad.app.entity.TipoDocumentoEntity;
import com.sintad.app.repository.TipoDocumentoRepository;

@RestController
@RequestMapping("/api")
public class TipoDocumentoController {

	@Autowired
	private TipoDocumentoRepository repositorio;
	
	@GetMapping("/tipo_documento/{id}")
	public TipoDocumentoEntity getTipoContribuyente(@PathVariable int id) throws Exception {
		System.out.println(repositorio.findById(id).get());
		return repositorio.findById(id).get();
	}
}
