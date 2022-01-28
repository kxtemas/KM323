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
	
	// Connect to the datasource constructor
	public ProductDataService(DataSource dataSource) {	
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// Get all products
	@Override
	public List<ProductModel> getProduct() {
		return jdbcTemplate.query("select * from product",
				new ProductMapper());
	}

	// Add one product to the database
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

	@Override
	public boolean deleteOne(int id) {
		int updateResult = jdbcTemplate.update(
				"delete from product where id = ?",
				new Object[] {id});
		return (updateResult > 0);
	}

	@Override
	public ProductModel updateOne(int idToUpdate, ProductModel updateProduct) {
		int result = jdbcTemplate.update(
				"update product set tripName = ?, tripDes = ?, startDate = ?, duration = ?, price = ?, tripType = ? where id = ?",
				updateProduct.getTripName(),
				updateProduct.getTripDes(),
				updateProduct.getStartDate(),
				updateProduct.getDuration(),
				updateProduct.getPrice(),
				updateProduct.getTripType(),
				idToUpdate );
		if (result > 0) {
			return updateProduct;
		}
		else {
			return null;
		}
	}

	@Override
	public ProductModel getById(int id) {
		ProductModel result = jdbcTemplate.queryForObject("select * from product where id = ?",
				new ProductMapper(),
				new Object[] {id}
		);
		return result;
	}




}
