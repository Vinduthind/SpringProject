package com.springmvc.coding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/")
	public String showHomepage() {
		return "main-menu";
		
	}
	

}
