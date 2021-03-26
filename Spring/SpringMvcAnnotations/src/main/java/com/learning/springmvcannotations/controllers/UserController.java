package com.learning.springmvcannotations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springmvcannotations.models.UserModel;
import com.learning.springmvcannotations.services.IUserDao;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	IUserDao dao;
	
	UserModel usr;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		List<UserModel> modelList=dao.getAllUsers();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("users");
		mv.addObject("mdList", modelList);
		return mv;
	}
	
	@RequestMapping("/add")
	public String addUser()
	{
		usr=new UserModel(101, "abc", "Mum", "45678931");
		dao.addUser(usr);
		return "success";
	}
	
	@RequestMapping("/create-user")
	public ModelAndView createUser()
	{
		return new ModelAndView("createUser","command", new UserModel());
	}
	
	@RequestMapping(path="/create-user",method = RequestMethod.POST )
	public String createUser(@ModelAttribute("usr") UserModel usrModel)
	{
		dao.addUser(usrModel);
		return "redirect:/users/";
	}
	
	
}
