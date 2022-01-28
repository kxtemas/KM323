package com.gcu;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


import com.gcu.business.FiveValidLogins;
import com.gcu.business.LoginAuthenticate;
import com.gcu.business.ProductBusinessInterface;
import com.gcu.business.ProductBusinessService;
import com.gcu.business.RegistrationBusinessInterface;
import com.gcu.business.RegistrationBusinessService;
import com.gcu.business.SecurityServiceInterface;

@Configuration

public class SpringConfig{

	// Bean for validation with request scope
	@Bean(name="securityService")
	@RequestScope
	public SecurityServiceInterface getSecurityService()
	{
		return new LoginAuthenticate();
	}
	
	//Beann for test, init and destroy with request scope
	@Bean(name="registrationService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public RegistrationBusinessInterface getRegistrationService()
	{
		return new RegistrationBusinessService();
	}
	
	//Beann for test, init and destroy with request scope
		@Bean(name="productService", initMethod="init", destroyMethod="destroy")
		@RequestScope
		public ProductBusinessInterface getProductService()
		{
			return new 	ProductBusinessService();
		}
	
	
}
