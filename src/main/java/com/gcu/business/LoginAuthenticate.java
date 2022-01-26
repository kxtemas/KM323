package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.RegistrationDataService;
import com.gcu.model.LoginModel;
import com.gcu.model.RegistrationModel;

public class LoginAuthenticate implements SecurityServiceInterface {

	@Autowired
	RegistrationDataService userDAO;
	
	@Override
	public boolean isAuthenticated(LoginModel loginModel) {

		 
		 List<RegistrationModel> doesHeExist = userDAO.findOneUser(loginModel.getUsername(), loginModel.getPassword());
		 
		 System.out.println("Number of users found = " + doesHeExist.size());
		 if (doesHeExist.size() > 0 ) {
			 return true;
		 }
		 else 
			 return   false;
	}

}
