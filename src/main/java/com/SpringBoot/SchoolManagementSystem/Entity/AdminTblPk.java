package com.SpringBoot.SchoolManagementSystem.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@	Embeddable
public class AdminTblPk implements Serializable{
	@Column(nullable = false)
	private String adminId;

	public AdminTblPk() {
	}

	public AdminTblPk(String adminId) {
		this.adminId = adminId.trim();
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adminId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminTblPk other = (AdminTblPk) obj;
		return Objects.equals(adminId, other.adminId);
	}
	
	

}
