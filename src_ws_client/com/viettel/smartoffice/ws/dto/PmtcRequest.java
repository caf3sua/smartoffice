package com.viettel.smartoffice.ws.dto;

public class PmtcRequest {

	private String id;
	private String wsClientId;
	private String wsClientSecret;
	private String wsUsername;
	private String wsPassword;
	private String wsGrantType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWsClientId() {
		return wsClientId;
	}
	public void setWsClientId(String wsClientId) {
		this.wsClientId = wsClientId;
	}
	public String getWsClientSecret() {
		return wsClientSecret;
	}
	public void setWsClientSecret(String wsClientSecret) {
		this.wsClientSecret = wsClientSecret;
	}
	public String getWsUsername() {
		return wsUsername;
	}
	public void setWsUsername(String wsUsername) {
		this.wsUsername = wsUsername;
	}
	public String getWsPassword() {
		return wsPassword;
	}
	public void setWsPassword(String wsPassword) {
		this.wsPassword = wsPassword;
	}
	public String getWsGrantType() {
		return wsGrantType;
	}
	public void setWsGrantType(String wsGrantType) {
		this.wsGrantType = wsGrantType;
	}
	
}
