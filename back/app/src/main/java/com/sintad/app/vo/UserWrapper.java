package com.sintad.app.vo;

import java.io.Serializable;

public class UserWrapper implements Serializable {
	
	private static final long serialVersionUID = 74670778113518913L;
	
	private String username;
	private String name;
	private String token;
	
	public UserWrapper(UserVo userVo,String token) {
		this.username=userVo.getUsername();
		this.name=userVo.getName();
		this.token=token;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
