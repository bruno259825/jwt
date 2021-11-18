package com.sintad.app.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import com.sintad.app.entity.EntidadEntity;

public class TipoContribuyenteVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;

	private String nombre;

	private Boolean estado;

	private List<EntidadEntity> entidades;
	
	public List<EntidadEntity> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadEntity> entidades) {
		this.entidades = entidades;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
