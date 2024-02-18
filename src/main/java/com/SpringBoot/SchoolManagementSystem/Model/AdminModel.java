package com.SpringBoot.SchoolManagementSystem.Model;

import javax.persistence.Version;

public class AdminModel {
	
	private String adminId;
	private Short adminType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobile;
	private String emailId;
	private String imagePath;
	private String imageExt;
	private boolean activeStatus;
	private Integer lockingVersion;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public Short getAdminType() {
		return adminType;
	}
	public void setAdminType(Short adminType) {
		this.adminType = adminType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageExt() {
		return imageExt;
	}
	public void setImageExt(String imageExt) {
		this.imageExt = imageExt;
	}
	public boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Integer getLockingVersion() {
		return lockingVersion;
	}
	public void setLockingVersion(Integer lockingVersion) {
		this.lockingVersion = lockingVersion;
	}
	
	
}
