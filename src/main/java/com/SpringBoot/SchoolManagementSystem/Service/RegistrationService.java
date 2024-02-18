package com.SpringBoot.SchoolManagementSystem.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.SchoolManagementSystem.Configuration.ServiceReplyModel;
import com.SpringBoot.SchoolManagementSystem.Entity.StudentTbl;
import com.SpringBoot.SchoolManagementSystem.Entity.StudentTblPk;
import com.SpringBoot.SchoolManagementSystem.Model.StudentModel;
import com.SpringBoot.SchoolManagementSystem.Repository.StudentRepo;

@Service
public class RegistrationService {
@Autowired StudentRepo studentRepo;
	public ServiceReplyModel registerStudent(StudentModel studentModel) {
		ServiceReplyModel serviceReplyModel = new ServiceReplyModel();
		// TODO Auto-generated method stub
		StudentTbl studentTbl = new StudentTbl();
		BeanUtils.copyProperties(studentModel, studentTbl);
		studentTbl.setStudentTblPk(new StudentTblPk(studentModel.getStudentId(), studentModel.getStreamId()));
		studentRepo.save(studentTbl);
		serviceReplyModel.setModel(studentModel);
		return serviceReplyModel;
	}

}
