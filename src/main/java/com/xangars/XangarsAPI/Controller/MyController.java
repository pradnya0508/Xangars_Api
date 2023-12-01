package com.xangars.XangarsAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xangars.XangarsAPI.Entities.Login;
import com.xangars.XangarsAPI.Services.LoginService;

@RestController
@Component
public class MyController 
{
	@Autowired
	public LoginService loginservice;

	@GetMapping ("/home")
	public String home() 
	{
		return "This is my home page";
	}
	
	
	//get the login API
	
	@GetMapping("/loginUsers")
	public List<Login> getLogin()
	{
		return this.loginservice.getLogin();
		
	}

	
}