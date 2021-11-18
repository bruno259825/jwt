package com.sintad.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "Entidad")
@Table(name = "tb_entidad")
public class EntidadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_entidad", nullable = false,columnDefinition = "int(11)")
	private Integer id;
	
	@Column(name = "nro_documento", nullable = false,columnDefinition = "varchar(25)")
	private String nro_documento;
	
	@Column(name = "razon_social", nullable = false,columnDefinition = "varchar(100)")
	private String razon_social;
	
	@Column(name = "nombre_comercial", nullable = true,columnDefinition = "varchar(100) DEFAULT null")
	private String nombre_comercial;
	
	@Column(name = "direccion", nullable = true,columnDefinition = "varchar(250) DEFAULT null")
	private String direccion;
	
	@Column(name = "telefono", nullable = true,columnDefinition = "varchar(50) DEFAULT null")
	private String telefono;
	
	@Column(name = "estado", nullable = false,columnDefinition = "bit(1) DEFAULT b'1'")
	private Boolean estado;
	
	public EntidadEntity() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@ManyToOne
	@JoinColumn(name = "id_tipo_contribuyente")
	@JsonBackReference
	private TipoContribuyenteEntity tipoContribuyente;

	public TipoContribuyenteEntity getTipoContribuyente() {
		return tipoContribuyente;
	}

	public void setTipoContribuyente(TipoContribuyenteEntity tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_documento")
	@JsonBackReference
	private TipoDocumentoEntity tipoDocumento;

	public TipoDocumentoEntity getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
}
