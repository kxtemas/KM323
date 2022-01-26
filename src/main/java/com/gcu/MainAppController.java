package com.gcu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainAppController {
	// home page handler
		@GetMapping("/")
		public String indexPage() 
		{

			return "index";
			
		}
		
		@GetMapping("/products")
		public String productPage() 
		{

			return "products";
			
		}
		
	
		
		
}
