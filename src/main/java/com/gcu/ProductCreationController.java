package com.gcu;

import java.util.List;


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
		// Add one product
		productService.addOne(productModel);
		
		model.addAttribute("productModel", productModel);
		return "productCreationSuccess";
		
	}
	@GetMapping("/admin")
	public String showOrdersForAdmin( Model model) 
	{  
		// display all orders with delete and edit buttons
		List<ProductModel> product = productService.getProduct(); 
		model.addAttribute("title", "Edit or delete orders");
		
		model.addAttribute("products", product);
		// ordersAdmin page shows a table of orders including buttons for del and edit.
		return "productAdmin";
		
	}
	@PostMapping("/delete")
	// process a request from the AddOrderForm.  Add a new order to the database.  Show all orders.
	public String deleteOrder(@Valid ProductModel product, BindingResult bindingResult, Model model)
	{// add the new order
		productService.deleteOne(product.getId());
		// get updated list of all the orders
		List<ProductModel> products = productService.getProduct();
		// display all 
		model.addAttribute("products", products);
		return "productAdmin";
		}
	@PostMapping("/editForm") 	
		public String displayEditForm(ProductModel productModel, Model model)
		{// Display new order form
			model.addAttribute("title", "Edit order");
			model.addAttribute("productModel", productModel);
			return "sample";
			}
		
		@PostMapping("/doUpdate") 
		// process a request from the AddOrderForm.  Add a new order to the database.  Show all orders.
		public String updateOrder(@Valid ProductModel productModel, BindingResult bindingResult, Model model)
		{// add the new order
			productService.updateOne(productModel.getId(), productModel);
			// get updated list of all the orders
			List<ProductModel> products = productService.getProduct();
			// display all
			model.addAttribute("products", products);

return "productAdmin";
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
