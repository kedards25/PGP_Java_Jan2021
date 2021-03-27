package com.learning.springmvcannotations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//serving form with pre-populated data from DB
	@RequestMapping("edit-user/{id}")
	public ModelAndView editUser(@PathVariable("id") int modelId)
	{
		usr=dao.getUserById(modelId);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("editUser1");
		mv.addObject("modelObj", usr);
		return mv;
		
	}
	
	@RequestMapping(path="edit-user/{id}",method=RequestMethod.POST)
	public String editUser(@PathVariable("id") int modelId,
							@RequestParam("usernm") String userNm,
							@RequestParam("useradr") String userAddr,
							@RequestParam("usernum") String userNum)
	{
		//usr=dao.getUserById(modelId);
		//System.out.println(usr);
		
		//usr is being loaded with record with id provided in url
		usr=dao.getUserById(modelId);	
		
		//we are updating the details with new values
		usr.setUserName(userNm);
		usr.setUserAddr(userAddr);
		usr.setUserNumber(userNum);
		dao.editUser(usr);
		
		//to display new values we are redirecting
		//it to index page
		return "redirect:/users/";
	}
	
	@RequestMapping("/delete-user/{id}")
	public ModelAndView deleteUser(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("delete");
		mv.addObject("modelId", id);
		return mv;
	}
	
	@RequestMapping(path="/delete-user/{id}",method = RequestMethod.POST)
	public String deleteUser1(@PathVariable("id") int id)
	{
		dao.deleteUser(id);
		return "redirect:/users/";
	}
	
}
