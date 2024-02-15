package com.SpringBoot.SchoolManagementSystem.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class StudentTbl implements Serializable {

	@	EmbeddedId
	protected StudentTblPk studentTblPk;
	private Short loginId;
	private Short admissionYear;
	private Short enrollStage;
	private Short currentStage;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String mobile;
	private Short registrationNo;
	private String photoPath;
	private String photoExt;
	private boolean isConnectedToMail;
	private Date creationDate;
	private boolean activeStatus;
	@Version
	private Integer lockingVersion;
	
	public StudentTbl() {
		this.activeStatus = true;
		this.studentTblPk = new StudentTblPk();
	}

	public StudentTbl(StudentTblPk studentTblPk) {
		this.studentTblPk = studentTblPk;
	}

	public StudentTblPk getStudentTblPk() {
		return studentTblPk;
	}

	public void setStudentTblPk(StudentTblPk studentTblPk) {
		this.studentTblPk = studentTblPk;
	}

	public Short getLoginId() {
		return loginId;
	}

	public void setLoginId(Short loginId) {
		this.loginId = loginId;
	}

	public Short getAdmissionYear() {
		return admissionYear;
	}

	public void setAdmissionYear(Short admissionYear) {
		this.admissionYear = admissionYear;
	}

	public Short getEnrollStage() {
		return enrollStage;
	}

	public void setEnrollStage(Short enrollStage) {
		this.enrollStage = enrollStage;
	}

	public Short getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(Short currentStage) {
		this.currentStage = currentStage;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Short getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Short registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getPhotoExt() {
		return photoExt;
	}

	public void setPhotoExt(String photoExt) {
		this.photoExt = photoExt;
	}

	public boolean isConnectedToMail() {
		return isConnectedToMail;
	}

	public void setConnectedToMail(boolean isConnectedToMail) {
		this.isConnectedToMail = isConnectedToMail;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
