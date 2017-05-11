package com.viettel.smartoffice.ws.dto;

public class TtnsTimeKeepingRequest {

	// Get list
	private Long employee_id;
	private Long time_keeping;
	private String work_place_type;
	private String type;
	private String source_data;
	private String private_key;
	
	private String id;
	private String comment;
	
	private String[] lstEmpIds;
	private Long year;
	
	private Long approve_emp_id;
	private Long from_time;
	private Long end_time;
	
	private Long status;
	private String reason;
	
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	public Long getTime_keeping() {
		return time_keeping;
	}
	public void setTime_keeping(Long time_keeping) {
		this.time_keeping = time_keeping;
	}
	public String getWork_place_type() {
		return work_place_type;
	}
	public void setWork_place_type(String work_place_type) {
		this.work_place_type = work_place_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSource_data() {
		return source_data;
	}
	public void setSource_data(String source_data) {
		this.source_data = source_data;
	}
	public String getPrivate_key() {
		return private_key;
	}
	public void setPrivate_key(String private_key) {
		this.private_key = private_key;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String[] getLstEmpIds() {
		return lstEmpIds;
	}
	public void setLstEmpIds(String[] lstEmpIds) {
		this.lstEmpIds = lstEmpIds;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public Long getApprove_emp_id() {
		return approve_emp_id;
	}
	public void setApprove_emp_id(Long approve_emp_id) {
		this.approve_emp_id = approve_emp_id;
	}
	public Long getFrom_time() {
		return from_time;
	}
	public void setFrom_time(Long from_time) {
		this.from_time = from_time;
	}
	public Long getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Long end_time) {
		this.end_time = end_time;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
