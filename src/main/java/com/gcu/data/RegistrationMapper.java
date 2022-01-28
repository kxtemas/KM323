package com.gcu.data;

import java.sql.ResultSet;

import org.springframework.jdbc.core.RowMapper;


import com.gcu.model.RegistrationModel;


import java.sql.SQLException;
public class RegistrationMapper implements RowMapper<RegistrationModel>{

	public RegistrationModel mapRow(ResultSet resultSet, int i) throws SQLException{
		RegistrationModel user = new RegistrationModel(
				resultSet.getInt("id"),
				resultSet.getString("username"),
				resultSet.getString("password"),
				resultSet.getString("lastName"),
				resultSet.getString("firstName"),
				resultSet.getString("phone"),
				resultSet.getString("email")
				);
		return user;			
	}
}
