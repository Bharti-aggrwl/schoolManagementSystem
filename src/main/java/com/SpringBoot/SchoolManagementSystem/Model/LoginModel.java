package com.SpringBoot.SchoolManagementSystem.Model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

public class LoginModel {
	
	private Integer loginId;
	private String userId;
	private Short userType;
	private String emailId;
	private boolean emailVerified;
	private String mobile;
	private Date loginTime;
	private Date logoutTime;
	private String encryptedPassword;
	private boolean activeStatus;
	private Integer lockingVersion;
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Short getUserType() {
		return userType;
	}
	public void setUserType(Short userType) {
		this.userType = userType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
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
