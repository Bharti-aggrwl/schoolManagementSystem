package com.SpringBoot.SchoolManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.SchoolManagementSystem.Configuration.Reply;
import com.SpringBoot.SchoolManagementSystem.Configuration.ServiceReplyModel;
import com.SpringBoot.SchoolManagementSystem.Entity.LoginTbl;
import com.SpringBoot.SchoolManagementSystem.Repository.LoginRepository;

@Service
public class LoginService {
 private static LoginRepository loginRepo;
 
@Autowired
	public LoginService(LoginRepository loginRepo) {
	this.loginRepo = loginRepo;
	
}


	public ServiceReplyModel getValidateLoginData(String email, String password) {
		// TODO Auto-generated method stub
		ServiceReplyModel reply = new ServiceReplyModel();
		List<LoginTbl> loginOptional= loginRepo.findAll();
		if(loginOptional!=null) {
			 reply.setMessage("login successfully");
			 return reply;
		}else {
			 reply.setMessage("Invalid Email Id");
			return reply;
		}
	}

}
