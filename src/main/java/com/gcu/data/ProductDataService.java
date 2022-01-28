package com.gcu.data;

import java.util.List; 

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.gcu.model.ProductModel;


@Repository
public class ProductDataService implements ProductDataAccessInterface {

	@Autowired
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	public ProductDataService(DataSource dataSource) {	
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<ProductModel> getProduct() {
		return jdbcTemplate.query("select username, password from users",
				new ProductMapper());
	}

	@Override
	public int addOne(ProductModel newProduct) {
		return jdbcTemplate.update(
				"insert into product (tripName, tripDes, startDate, duration, price, tripType) values(?,?,?,?,?,?)",
				newProduct.getTripName(),
				newProduct.getTripDes(),
				newProduct.getStartDate(),
				newProduct.getDuration(),
				newProduct.getPrice(),
				newProduct.getTripType()
				
				);
	}


//	@Override
//	public List<RegistrationModel> findOneUser(String userName, String password) 
//	{
//		System.out.println(userName + " " + password);
//		return jdbcTemplate.query("select * from users WHERE username = ? AND password = ?",
//				new RegistrationMapper(),
//				 userName ,
//				 password
//		);
//	}

}
