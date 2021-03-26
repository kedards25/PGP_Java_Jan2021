package com.learning.springmvcannotations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springmvcannotations.models.UserModel;

@Controller
@RequestMapping("/demo")
public class DemoController {

	
	
	UserModel model;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/create")
	public String createModel()
	{
		model=new UserModel(101, "abc", "jog", "4568731");
		return "success";
	}
	
	@RequestMapping("/show")
	public ModelAndView showUser()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("modelObj", model);
		mv.setViewName("showUser");
		return mv;
	}
	
//	@RequestMapping("/getbyid/{usrid}")
//	public ModelAndView getUserById(@PathVariable("usrid") int id)
//	{
//		//model=
//	}
	
	@RequestMapping("/edit")
	public ModelAndView editUser()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("modelObj", model);
		mv.setViewName("editUser");
		return mv;
	}
}
