package com.gcu.business;

import java.util.List;

import com.gcu.model.RegistrationModel;

public interface RegistrationBusinessInterface {

	public void test();
	public void init();
	public void destroy();
	public int addOne(RegistrationModel newUsers);
	public List <RegistrationModel> getUsers();
	public List<RegistrationModel> findOneUser(String userName, String password);
	
}
