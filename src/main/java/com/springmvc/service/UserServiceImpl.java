package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.model.Login;
import com.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	  public UserDao userDao;

	  public int register(User user) {
		  System.out.println("UserServiceImpl!!!!!!!!!!!");
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}