package com.SpringBoot.SchoolManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/api/user/")
	public String getData()
	{
		return "this is data";
	}
}
