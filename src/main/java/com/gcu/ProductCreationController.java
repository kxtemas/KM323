package com.gcu;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductBusinessInterface;
import com.gcu.model.ProductModel;

@Controller
@RequestMapping("/productCreation")
public class ProductCreationController {
	
	@Autowired
	ProductBusinessInterface productService;
	
	@GetMapping("/")
	public String display(Model model)
	{
		// Display Product Creation Form View
		model.addAttribute("title", "ProductCreation Form");
		model.addAttribute("productModel", new ProductModel());
		return "productCreation";
	}
	
	@PostMapping("/doProduct")
	public String doLogin(@Valid ProductModel productModel,BindingResult bindingResult, Model model)
	{
		// Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "ProductCreation Form");
			return "productCreation";
		}
		
		
		productService.test();
		productService.addOne(productModel);
		
		model.addAttribute("productModel", productModel);
		return "productCreationSuccess";
		
	}
}
