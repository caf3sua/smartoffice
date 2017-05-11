package com.viettel.smartoffice.ws.dto;

public class TtnsRequest {

	private String id;
	private String wsClientId;
	private String wsClientSecret;
	private String wsUsername;
	private String wsPassword;
	private String wsGrantType;
	
	private String type;
	private String from_date;
	private String to_date;
	private String status;
	private String reason;
	private String type_resign;
	private String personal_form_id;
	
	// delete
	private String form_type_id;
	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getPersonal_form_id() {
		return personal_form_id;
	}

	public void setPersonal_form_id(String personal_form_id) {
		this.personal_form_id = personal_form_id;
	}

	public String getType_resign() {
		return type_resign;
	}

	public void setType_resign(String type_resign) {
		this.type_resign = type_resign;
	}

	public String getForm_type_id() {
		return form_type_id;
	}

	public void setForm_type_id(String form_type_id) {
		this.form_type_id = form_type_id;
	}
	
}
