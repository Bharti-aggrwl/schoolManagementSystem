package com.SpringBoot.SchoolManagementSystem.Entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "admin_tbl")
public class AdminTbl implements Serializable {
	
	@EmbeddedId
	protected AdminTblPk adminTblPk;
	private Short adminType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobile;
	private String emailId;
	private String imagePath;
	private String imageExt;
	private boolean activeStatus;
	@Version
	private Integer lockingVersion;
	
	public AdminTbl() {
		this.activeStatus = true;
		this.adminTblPk = new  AdminTblPk();
	}
	
	public AdminTbl(AdminTblPk adminTblPk) {
		this.adminTblPk = adminTblPk;
	}

	public AdminTblPk getAdminTblPk() {
		return adminTblPk;
	}
	public void setAdminTblPk(AdminTblPk adminTblPk) {
		this.adminTblPk = adminTblPk;
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
