package com.sintad.app.vo;

import java.io.Serializable;

public class EntidadVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;

	private String nro_documento;

	private String razon_social;
	
	private String nombre_comercial;

	private String direccion;

	private String telefono;

	private Boolean estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	
}
