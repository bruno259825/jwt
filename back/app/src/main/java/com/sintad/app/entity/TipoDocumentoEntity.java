package com.sintad.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "TipoDocumento")
@Table(name = "tb_tipo_documento")
public class TipoDocumentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo_documento", nullable = false,columnDefinition = "int(11)")
	private Integer id;
	
	@Column(name = "codigo", nullable = false,columnDefinition = "varchar(20)")
	private String codigo;
	
	@Column(name = "nombre", nullable = false,columnDefinition = "varchar(100)")
	private String nombre;
	
	@Column(name = "descripcion", nullable = true,columnDefinition = "varchar(200) DEFAULT null")
	private String descripcion;
	
	@Column(name = "estado", nullable = false,columnDefinition = "bit(1) DEFAULT b'1'")
	private Boolean estado;
	
	
	@OneToMany(mappedBy="tipoDocumento")
	@JsonManagedReference
	private List<EntidadEntity> entidades;
	
	
	public List<EntidadEntity> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadEntity> entidades) {
		this.entidades = entidades;
	}
	
	public TipoDocumentoEntity() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
