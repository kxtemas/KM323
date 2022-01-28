package com.gcu.business;

import java.util.List; 

import com.gcu.model.ProductModel;

public interface ProductBusinessInterface {

	public void test();
	public void init();
	public void destroy();
	public int addOne(ProductModel newProduct);
	public List <ProductModel> getProduct();
	public boolean deleteOne(int id);
	public ProductModel updateOne(int idToUpdate, ProductModel updateProduct);
	public ProductModel getById(int id);
	
}
