package com.springmvc.coding;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;


@Controller
@RequestMapping("/student")
public class HelloWorldController {
	
	
	
	
	@RequestMapping("/showForm")
	public String showHelloForm(Model model) {
	  
		
		return "helloworld-form";
		
	}
	
	@RequestMapping("/processForm")
	public String showHelloConfirmation(HttpServletRequest request,Model model,@RequestParam("lastname")String lname) {
   String name=request.getParameter("firstname");
		
	model.addAttribute("studentname",name.toUpperCase());
	model.addAttribute("studentlastname",lname.toUpperCase());
		
		return "helloworld";
		
	}
	
	
	

}
