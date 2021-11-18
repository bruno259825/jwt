package com.sintad.app.vo;

import java.io.Serializable;
import java.util.List;

import com.sintad.app.entity.EntidadEntity;

public class TipoDocumentoVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String codigo;
	
	private String nombre;
	
	private String descripcion;
	
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	
}
