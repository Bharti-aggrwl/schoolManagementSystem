package com.SpringBoot.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SchoolManagementSystem.Configuration.Reply;
import com.SpringBoot.SchoolManagementSystem.Configuration.ServiceReplyModel;
import com.SpringBoot.SchoolManagementSystem.Model.StudentModel;
import com.SpringBoot.SchoolManagementSystem.Service.RegistrationService;

@RestController
public class RegistrationController {
@Autowired
private RegistrationService registrationService;
	@PostMapping("/api/registration/")
	public Reply registerStudent(@RequestBody StudentModel studentModel)
	{
		Reply reply = new Reply();
		ServiceReplyModel serviceReplyModel =  registrationService.registerStudent(studentModel);
		
		reply.setData(serviceReplyModel.getModel());
		return reply;
		
	}
}
