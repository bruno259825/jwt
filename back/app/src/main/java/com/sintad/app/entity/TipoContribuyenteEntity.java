package com.sintad.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "TipoContribuyente")
@Table(name = "tb_tipo_contribuyente")
public class TipoContribuyenteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo_contribuyente", nullable = false,columnDefinition = "int(11)")
	private Integer id;

	@Column(name="nombre",nullable = false,columnDefinition = "varchar(50)")
	private String nombre;

	@Column(name = "estado", nullable = false,columnDefinition = "bit(1) DEFAULT b'1'")
	private Boolean estado;

	@OneToMany(mappedBy="tipoContribuyente")
	@JsonManagedReference
	private List<EntidadEntity> entidades;
	
	
	
	public List<EntidadEntity> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadEntity> entidades) {
		this.entidades = entidades;
	}



	public TipoContribuyenteEntity() {
		super();
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
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
