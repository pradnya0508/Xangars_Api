package com.xangars.XangarsAPI.Services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xangars.XangarsAPI.Entities.Login;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	List<Login> list;
	
	public LoginServiceImpl() {
		list =new ArrayList<>();
		list.add(new Login(101,"Pradnya","pradnya.0508@gmail.com"));
		list.add(new Login(102,"Akash","Akash.0508@gmail.com"));
	}


	@Override
	public List<Login> getLogin() 
	{
		
		return list;
	}

}
