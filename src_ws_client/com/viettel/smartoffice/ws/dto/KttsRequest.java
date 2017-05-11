package com.viettel.smartoffice.ws.dto;

public class KttsRequest {

	
	private Long idBBBGTSCN;
	private Integer start;
	private Integer limit;
	
	private String userName;
	private String password;
	private String employeeId;
	private Long type;
	private String keyword;
	
	private Long status;
	
	private Long merEntityId;
	private Long count;
	private Long date;
	private String reason;
	
	
	public Long getIdBBBGTSCN() {
		return idBBBGTSCN;
	}
	public void setIdBBBGTSCN(Long idBBBGTSCN) {
		this.idBBBGTSCN = idBBBGTSCN;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getMerEntityId() {
		return merEntityId;
	}
	public void setMerEntityId(Long merEntityId) {
		this.merEntityId = merEntityId;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
		
}
