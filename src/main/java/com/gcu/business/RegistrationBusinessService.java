package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.RegistrationDataService;
import com.gcu.model.RegistrationModel;

public class RegistrationBusinessService implements RegistrationBusinessInterface {

	@Autowired
	RegistrationDataService userDAO;
	// Test Method
	@Override
	public void test() {
		System.out.println("This is a test method from Registration business.");

	}

	// Init method
	@Override
	public void init() {
		System.out.println("Init method of RegistrationBusinessService was just called.");

	}

	// Destroy method
	@Override
	public void destroy() {
		System.out.println("Destroy method of RegistrationBusinessService was just called.");

	}

	
	@Override
	public int addOne(RegistrationModel newUsers) {
		// TODO Auto-generated method stub
		return userDAO.addOne(newUsers);
	}

	@Override
	public List<RegistrationModel> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.getUsers();
	}

	@Override
	public List<RegistrationModel> findOneUser(String userName, String password) {
		// TODO Auto-generated method stub
		return userDAO.findOneUser(userName, password);
	}
	
	

}
