//package com.SpringBoot.SchoolManagementSystem.Service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.SpringBoot.SchoolManagementSystem.Configuration.Reply;
//import com.SpringBoot.SchoolManagementSystem.Configuration.ServiceReplyModel;
//import com.SpringBoot.SchoolManagementSystem.Entity.LoginTbl;
//import com.SpringBoot.SchoolManagementSystem.Repository.LoginRepo;
//
//@Service
//public class LoginService {
// private static LoginRepo loginRepo;
// 
//@Autowired
//	public LoginService(LoginRepo loginRepo) {
//	this.loginRepo = loginRepo;
//	
//}
//
//
//	public ServiceReplyModel getValidateLoginData(String email, String password) {
//		// TODO Auto-generated method stub
//		ServiceReplyModel reply = new ServiceReplyModel();
//		Optional<LoginTbl> loginOptional= loginRepo.findByLoginTblEmailIdAndPassword(email,password);
//		if(loginOptional.isPresent()) {
//			 reply.setMessage("login successfully");
//			 return reply;
//		}else {
//			 reply.setMessage("Invalid Email Id");
//			return reply;
//		}
//	}
//
//}
