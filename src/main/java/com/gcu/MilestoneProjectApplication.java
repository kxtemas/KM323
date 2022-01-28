/*
 * Toan Nguyen
 * Katie Munoz
 * Milestone 2
 * 09/90/2021
 */


package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.gcu"})
@SpringBootApplication
public class MilestoneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilestoneProjectApplication.class, args);
	}

}
