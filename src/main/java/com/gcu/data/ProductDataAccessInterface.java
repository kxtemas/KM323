package com.gcu.data;

import java.util.List;  

import com.gcu.model.LoginModel;
import com.gcu.model.ProductModel;



public interface ProductDataAccessInterface {
	public List<ProductModel> getProduct();
	public int addOne(ProductModel newProduct);
	
	// return a user object if found in the db.  Return null if nothing found.
	//public List<ProductModel> findOneUser(String userName, String password);
	
	
}
