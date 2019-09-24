package com.springmvc.coding;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/studentreg")
public class StudentController {
	
	@InitBinder
	public void initmethod(WebDataBinder binder) {
		
		StringTrimmerEditor ath=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,ath);
		
	}
	
	
	@RequestMapping("/showForm")
	public String showRegistrationForm(Model model)
	{
		model.addAttribute("student",new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String showStudentConfirmation(@Valid@ModelAttribute("student")Student mystudent,BindingResult binding) {
	System.out.println(binding);
	if(!binding.hasErrors())
		
		return "studentconfirmation";
		
	
	return "student-form";
	}

}
