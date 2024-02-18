package com.SpringBoot.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SchoolManagementSystem.Configuration.Reply;
import com.SpringBoot.SchoolManagementSystem.Configuration.ServiceReplyModel;
//import com.SpringBoot.SchoolManagementSystem.Service.LoginService;

@RestController
//@RequestMapping("/api")
public class UserController {
	
//	@Autowired
//	LoginService loginService;
//	
//	public UserController(LoginService loginService) {
//		this.loginService = loginService;
//	}

	@GetMapping("/api/user/")
	public String getData()
	{
		return "this is data";
	}
	
//	@GetMapping("/login")
//	public Reply getValidateLogin( @PathVariable ("email") String email,  @PathVariable ("password") String password) {
//		 email ="shivani.sri140@gmail.com";
//		password ="123";
//		Reply reply = new Reply();
//		if(!validateLoginData(email,password)) {
//		     reply.setMessage("Invalid credentials");
//			return reply;
//		}
//		ServiceReplyModel serviceReplyModel =  loginService.getValidateLoginData(email,password);
//		reply.setData(serviceReplyModel);
//		return reply;
//		}
//
//	private boolean validateLoginData(String email, String password) {
//		// TODO Auto-generated method stub
//		if(email!=null && password!=null) {
//			return true;
//		}
//		return false;
//	}
	}
