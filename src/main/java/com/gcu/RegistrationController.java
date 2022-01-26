package com.gcu;

import javax.validation.Valid;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.RegistrationBusinessInterface;
import com.gcu.model.RegistrationModel;

@Controller
@RequestMapping("/registration")
public class RegistrationController 
{
	@Autowired
	RegistrationBusinessInterface registrationService;
	
	@GetMapping("/")
	public String display(Model model)
	{
		// Display Registration Form View
		model.addAttribute("title", "Registration Form");
		model.addAttribute("registrationModel", new RegistrationModel());
		return "registration";
	}
	
	@PostMapping("/doRegister")
	public String doLogin(@Valid RegistrationModel registrationModel,BindingResult bindingResult, Model model)
	{
		// Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "Registration Form");
			return "registration";
		}
		
		
		
		registrationService.test();
		registrationService.addOne(registrationModel);
		model.addAttribute("registrationModel", registrationModel);
		return "registrationSuccess";
		
	}

}
