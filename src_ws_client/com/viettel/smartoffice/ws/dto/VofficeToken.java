package com.viettel.smartoffice.ws.dto;

public class VofficeToken {
	
	private String access_token;
	private String aes_key;
	private String rsa_public_key;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getAes_key() {
		return aes_key;
	}
	public void setAes_key(String aes_key) {
		this.aes_key = aes_key;
	}
	public String getRsa_public_key() {
		return rsa_public_key;
	}
	public void setRsa_public_key(String rsa_public_key) {
		this.rsa_public_key = rsa_public_key;
	}

	
}
