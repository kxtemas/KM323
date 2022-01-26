package com.gcu.data;

import java.util.List; 

import com.gcu.model.LoginModel;
import com.gcu.model.RegistrationModel;



public interface RegistrationDataAccessInterface {
	public List<RegistrationModel> getUsers();
	public int addOne(RegistrationModel newUsers);
	
	// return a user object if found in the db.  Return null if nothing found.
	public List<RegistrationModel> findOneUser(String userName, String password);
	
	
}
