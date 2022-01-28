package com.gcu.data;

import java.sql.ResultSet; 

import org.springframework.jdbc.core.RowMapper;


import com.gcu.model.ProductModel;


import java.sql.SQLException;
public class ProductMapper implements RowMapper<ProductModel>{

	public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException{
		ProductModel product = new ProductModel(
				resultSet.getInt("id"),
				resultSet.getString("tripName"),
				resultSet.getString("tripDes"),
				resultSet.getString("startDate"),
				resultSet.getString("duration"),
				resultSet.getString("price"),
				resultSet.getString("tripType")
				);
		return product;			
	}
}
