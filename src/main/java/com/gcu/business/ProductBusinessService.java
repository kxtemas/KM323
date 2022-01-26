package com.gcu.business;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.ProductDataService;
import com.gcu.model.ProductModel;

public class ProductBusinessService implements ProductBusinessInterface {

	@Autowired
	ProductDataService productDAO;
	// Test Method
	@Override
	public void test() {
		System.out.println("This is a test method from productbusiness.");

	}

	// Init method
	@Override
	public void init() {
		System.out.println("Init method of productBusinessService was just called.");

	}

	// Destroy method
	@Override
	public void destroy() {
		System.out.println("Destroy method of productBusinessService was just called.");

	}

	
	@Override
	public int addOne(ProductModel newProduct) {
		// TODO Auto-generated method stub
		return productDAO.addOne(newProduct);
	}

	@Override
	public List<ProductModel> getProduct() {
		// TODO Auto-generated method stub
		return productDAO.getProduct();
	}

//	@Override
//	public List<RegistrationModel> findOneUser(String userName, String password) {
//		// TODO Auto-generated method stub
//		return userDAO.findOneUser(userName, password);
//	}
	
	

}
