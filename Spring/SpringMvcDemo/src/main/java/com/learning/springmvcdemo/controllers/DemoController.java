package com.learning.springmvcdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springmvcdemo.models.UserModel;

@Controller
public class DemoController {
	
	UserModel model;
	
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
	
	@RequestMapping("create-user")
	public String createUser()
	{
		model=new UserModel(101, "Kedar", "vpe", "5648973");
		return "success";
	}
	
	@RequestMapping("get-user")
	public ModelAndView getUserModel()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("userObj", model);
		mv.setViewName("dispUser");
		return mv;
	}
	
	//if we do not mention any method type of RequestMethod
	//then it is "get" by default
	@RequestMapping("register")
	public String registerUser() {
		return "userform";
	}
	
	@RequestMapping(path="register",method = RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("userid")int id,
								@RequestParam("usernm")String nm,
								@RequestParam("useradr") String adr,
								@RequestParam("usernum") String num)
	{
		model=new UserModel(id, nm, adr, num);
		ModelAndView mv=new ModelAndView();
		mv.addObject("userObj", model);
		mv.setViewName("dispUser");
		return mv;
	}
	

}
