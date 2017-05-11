package com.viettel.smartoffice.ws.dto;

public class VofficeRequest {
	private Integer userId;
	
	private String username;
	private String password;
	
	private String fromDate;
	private String toDate;
	
	private String missionName;
	private Long missionId;
	private Long typeMission;
	private Long startRecord;
	private Long pageSize;
	private Long type;

	private String taskName;
	private String content;
	private String isCount;
	private String status;
	
	private String title;
	private Long documentId;
	
	private Long orgAssignId;
	private Long orgPerformId;
	
	private Integer[] searchOrgIds;
	private Integer[] listStatus;
	
	private String access_token;
	private String aes_key;
	private String rsa_public_key;
	
	private Long textId;
	private Long isListFile;
	
	private Long taskId;
	
	private Long commanderId;
	private Long enforcementId;
	
	private String keyword;
	private String description;
	private String registerNumber;
	private String code;
	private Long areaId;
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	private Long typeId;
	
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

	// Text
	private Long state;
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}
	
	public Long getTypeMission() {
		return typeMission;
	}

	public void setTypeMission(Long typeMission) {
		this.typeMission = typeMission;
	}

	public Long getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(Long startRecord) {
		this.startRecord = startRecord;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getIsCount() {
		return isCount;
	}

	public void setIsCount(String isCount) {
		this.isCount = isCount;
	}

	public Long getMissionId() {
		return missionId;
	}

	public void setMissionId(Long missionId) {
		this.missionId = missionId;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public Long getOrgAssignId() {
		return orgAssignId;
	}

	public void setOrgAssignId(Long orgAssignId) {
		this.orgAssignId = orgAssignId;
	}

	public Long getOrgPerformId() {
		return orgPerformId;
	}

	public void setOrgPerformId(Long orgPerformId) {
		this.orgPerformId = orgPerformId;
	}

	public Integer[] getSearchOrgIds() {
		return searchOrgIds;
	}

	public void setSearchOrgIds(Integer[] searchOrgIds) {
		this.searchOrgIds = searchOrgIds;
	}

	public Integer[] getListStatus() {
		return listStatus;
	}

	public void setListStatus(Integer[] listStatus) {
		this.listStatus = listStatus;
	}

	public Long getTextId() {
		return textId;
	}

	public void setTextId(Long textId) {
		this.textId = textId;
	}

	public Long getIsListFile() {
		return isListFile;
	}

	public void setIsListFile(Long isListFile) {
		this.isListFile = isListFile;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getCommanderId() {
		return commanderId;
	}

	public void setCommanderId(Long commanderId) {
		this.commanderId = commanderId;
	}

	public Long getEnforcementId() {
		return enforcementId;
	}

	public void setEnforcementId(Long enforcementId) {
		this.enforcementId = enforcementId;
	}

	
}
