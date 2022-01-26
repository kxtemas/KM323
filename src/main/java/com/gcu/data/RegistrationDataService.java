package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gcu.model.LoginModel;
import com.gcu.model.RegistrationModel;

@Repository
public class RegistrationDataService implements RegistrationDataAccessInterface {

	@Autowired
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	public RegistrationDataService(DataSource dataSource) {	
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<RegistrationModel> getUsers() {
		return jdbcTemplate.query("select username, password from users",
				new RegistrationMapper());
	}

	@Override
	public int addOne(RegistrationModel newUsers) {
		return jdbcTemplate.update(
				"insert into users (username, password, lastName, firstName, phone, email) values(?,?,?,?,?,?)",
				newUsers.getUsername(),
				newUsers.getPassword(),
				newUsers.getLastName(),
				newUsers.getFirstName(),
				newUsers.getPhone(),
				newUsers.getEmail()
				);
	}


	@Override
	public List<RegistrationModel> findOneUser(String userName, String password) 
	{
		System.out.println(userName + " " + password);
		return jdbcTemplate.query("select * from users WHERE username = ? AND password = ?",
				new RegistrationMapper(),
				 userName ,
				 password
		);
	}

}
