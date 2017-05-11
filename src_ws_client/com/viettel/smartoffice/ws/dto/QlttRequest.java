package com.viettel.smartoffice.ws.dto;

public class QlttRequest {

	private String userName;
	private String password;
	private String test;
	
	private String name;
	private String code;
	private String description;
	private String authorName;
	private Integer type;
	
	private String filePath; 
	
	private Long documentCategoryId;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public Long getDocumentCategoryId() {
		return documentCategoryId;
	}
	public void setDocumentCategoryId(Long documentCategoryId) {
		this.documentCategoryId = documentCategoryId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
