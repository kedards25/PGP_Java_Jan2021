package com.learning.springmvcannotations.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.springmvcannotations.models.UserModel;

//DAO =>data access object
@Component
public interface IUserDao {
	
	//following method returns list of objects 
	//of class UserModel
	public List<UserModel> getAllUsers();
	
	//following method returns object 
	//of class UserModel based on Id we've provided
	public UserModel getUserById(int id);
	
	public void addUser(UserModel model);
	
	public void editUser(UserModel model);
	
	public void deleteUser(int id);
	
}
