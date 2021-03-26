package com.learning.springmvcannotations.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.learning.springmvcannotations.models.UserModel;


@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@Autowired
	SessionFactory factory;
	
	@Autowired
	UserModel model;
	
	public List<UserModel> getAllUsers() {
		List<UserModel> userList=factory
									.openSession()
									.createQuery(" from com.learning.springmvcannotations.models.UserModel")
									.list();
		return userList;
	}

	public UserModel getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUser(UserModel model) {
		factory.getCurrentSession().save(model);

	}

	public void editUser(UserModel model) {
		// TODO Auto-generated method stub

	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
