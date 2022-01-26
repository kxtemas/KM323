package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationModel 
{
	private int id;
	
	@NotNull(message="User name is a required field")
	@Size(min=1, max=32, message="User name must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	@NotNull(message="Last Name is a required field")
	@Size(min=1, max=32, message="Last Name must be between 1 and 32 characters")
	private String lastName;
	
	@NotNull(message="First Name is a required field")
	@Size(min=1, max=32, message="First Name must be between 1 and 32 characters")
	private String firstName;
	
	@NotNull(message="Phone is a required field")
	@Size(min=1, max=32, message="Phone must be between 1 and 32 characters")
	private String phone;
	
	@NotNull(message="Email is a required field")
	@Size(min=1, max=32, message="email must be between 1 and 32 characters")
	private String email;

	public RegistrationModel() {}
	
	public RegistrationModel(int id,
			@NotNull(message = "User name is a required field") @Size(min = 1, max = 32, message = "User name must be between 1 and 32 characters") String username,
			@NotNull(message = "Password is a required field") @Size(min = 1, max = 32, message = "Password must be between 1 and 32 characters") String password,
			@NotNull(message = "Last Name is a required field") @Size(min = 1, max = 32, message = "Last Name must be between 1 and 32 characters") String lastName,
			@NotNull(message = "First Name is a required field") @Size(min = 1, max = 32, message = "First Name must be between 1 and 32 characters") String firstName,
			@NotNull(message = "Phone is a required field") @Size(min = 1, max = 32, message = "Phone must be between 1 and 32 characters") String phone,
			@NotNull(message = "Email is a required field") @Size(min = 1, max = 32, message = "email must be between 1 and 32 characters") String email) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegistrationModel [id=" + id + ", username=" + username + ", password=" + password + ", lastName="
				+ lastName + ", firstName=" + firstName + ", phone=" + phone + ", email=" + email + "]";
	}
	
	

}
