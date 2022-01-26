package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.RegistrationDataService;
import com.gcu.model.LoginModel;
import com.gcu.model.RegistrationModel;

public class FiveValidLogins implements SecurityServiceInterface {

	@Autowired
	RegistrationDataService userDAO;
	
	@Override
	public boolean isAuthenticated(LoginModel loginModel) {

		
		
		// create a list of valid login names and passwords
		String [][] validLogins = new String [][] {
			{"Darius", "pass"},
			{"Sarafina", "nothing"},
			{"Merlin", "ihavethepower"},
			{"Quinn", "secret"},
			{"Jillian", "password"},
			{"Fanta", "fizzy"},
		};
		//List<RegistrationModel> validLogins = userDAO.getUsers();
		
		


		// check to see if the login matches any username/pass combo.
				boolean success = false;
				for(int i=0; i < validLogins.length; i++) {
					if (loginModel.getUsername().equals(validLogins[i][0]) && loginModel.getPassword().equals(validLogins[i][1]))
					{
						success = true;
					}
				}
				
				if (success)
				{
					// Login Success.
					return true;
				}
				else {
					// login failed.
					return false;
				}
	}

}
