package com.SpringBoot.SchoolManagementSystem.JwtModels;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;

@Builder
public class JWTResponse {
	private String jwtToken;
	private String userName;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public JWTResponse(String jwtToken, String userName) {
		super();
		this.jwtToken = jwtToken;
		this.userName = userName;
	}
	public JWTResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JWTResponse [jwtToken=" + jwtToken + ", userName=" + userName + "]";
	}

	
}
