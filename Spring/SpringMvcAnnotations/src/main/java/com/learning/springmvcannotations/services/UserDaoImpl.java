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
		UserModel model=(UserModel)factory
				.openSession()
				.createQuery(" from com.learning.springmvcannotations.models.UserModel"
						+ " where userid="+id)
				.list()
				.get(0);
		return model;
	}

	public void addUser(UserModel model) {
		factory.getCurrentSession().save(model);

	}

	public void editUser(UserModel model) {
		factory.getCurrentSession().saveOrUpdate(model);

	}

	public void deleteUser(int id) {
		model=getUserById(id);
		factory.getCurrentSession().delete(model);
	}

}
