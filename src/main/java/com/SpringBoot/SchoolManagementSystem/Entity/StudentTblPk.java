package com.SpringBoot.SchoolManagementSystem.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentTblPk implements Serializable {
	@Column(nullable = false)
	private String studentId;
	@Column(nullable = false)
	private Integer streamId;
	
	
	public StudentTblPk() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentTblPk(String studentId, Integer streamId) {
		super();
		this.studentId = studentId;
		this.streamId = streamId;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public Integer getStreamId() {
		return streamId;
	}


	public void setStreamId(Integer streamId) {
		this.streamId = streamId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(streamId, studentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentTblPk other = (StudentTblPk) obj;
		return Objects.equals(streamId, other.streamId) && Objects.equals(studentId, other.studentId);
	}

	

}
