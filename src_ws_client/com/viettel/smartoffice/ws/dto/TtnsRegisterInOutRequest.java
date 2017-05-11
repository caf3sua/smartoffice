package com.viettel.smartoffice.ws.dto;

public class TtnsRegisterInOutRequest {

	private String id;
	private String type;
	private Long syncTime;
	
	private Long emp_out_reg_id;
	private Long status;
	private String reason;
	private Long emp_approve_id;
	
	private Long employee_id;
	private Long from_time;
	private Long end_time;
	private Long reason_out_id;
	private Long work_place_id;
	private String reason_detail;
	
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
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
	public Long getReason_out_id() {
		return reason_out_id;
	}
	public void setReason_out_id(Long reason_out_id) {
		this.reason_out_id = reason_out_id;
	}
	public Long getWork_place_id() {
		return work_place_id;
	}
	public void setWork_place_id(Long work_place_id) {
		this.work_place_id = work_place_id;
	}
	public String getReason_detail() {
		return reason_detail;
	}
	public void setReason_detail(String reason_detail) {
		this.reason_detail = reason_detail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getSyncTime() {
		return syncTime;
	}
	public void setSyncTime(Long syncTime) {
		this.syncTime = syncTime;
	}
	public Long getEmp_out_reg_id() {
		return emp_out_reg_id;
	}
	public void setEmp_out_reg_id(Long emp_out_reg_id) {
		this.emp_out_reg_id = emp_out_reg_id;
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
	public Long getEmp_approve_id() {
		return emp_approve_id;
	}
	public void setEmp_approve_id(Long emp_approve_id) {
		this.emp_approve_id = emp_approve_id;
	}
	
}
