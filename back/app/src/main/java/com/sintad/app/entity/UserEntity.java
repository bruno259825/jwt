package com.sintad.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "tb_user")
public class UserEntity {
	private static final long serialVersionUID = 74670778113518913L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "username", unique = true, nullable = false)
	//@Pattern(regexp= "^[a-zA-Z0-9._-]{5,24}$", message = "El usuario es incorrecto")
	private String username;

	@Column(name = "nombre",nullable = true)
	//@Size(min = 2, max = 32, message="El numero de caracteres de nombre es incorrecto")
	//@Pattern(regexp = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.\\'-]+$", message = "El nombre es incorrecto.")
	private String name;

	@Column(name = "password", nullable = false)
	private String password;
	

	public UserEntity() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
