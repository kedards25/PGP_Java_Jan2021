package com.learning.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/home")
	public String welcome()
	{
		//"/views/index.jsp"
		return "index";
	}
	
	@RequestMapping("/")
	public String greet()
	{
		return "welcome";
	}
	

}
