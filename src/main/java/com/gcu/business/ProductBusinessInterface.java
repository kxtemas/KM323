package com.gcu.business;

import java.util.List; 

import com.gcu.model.ProductModel;

public interface ProductBusinessInterface {

	public void test();
	public void init();
	public void destroy();
	public int addOne(ProductModel newProduct);
	public List <ProductModel> getProduct();
	//public List<ProductModel> findOneUser(String userName, String password);
	
}
