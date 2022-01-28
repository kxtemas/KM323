package com.gcu.data;

import java.util.List;  

import com.gcu.model.LoginModel;
import com.gcu.model.ProductModel;



public interface ProductDataAccessInterface {
	public List<ProductModel> getProduct();
	public int addOne(ProductModel newProduct);
	public boolean deleteOne(int id);
	public ProductModel updateOne(int idToUpdate, ProductModel updateProduct);
	public ProductModel getById(int id);
	
	
}
