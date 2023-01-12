package com.training.web.service;

import java.util.Date;
import java.util.List;

import com.training.web.dao.LoginDao;
import com.training.web.dao.LoginDaoImpl;
import com.training.web.model.User;

public class LoginServiceImpl implements LoginService{
	LoginDao dao = new LoginDaoImpl();

	@Override

	public boolean isValidUser(String username, String password,Date date1) {

	 

	boolean isValid = false;

	List<User> userList = dao.getUsers();

	for (User user : userList) {

	if (user.getUserName().equals(username) && user.getPassword().equals(password) && user.getDate1().equals(date1)) {

	isValid = true;

	}

	}

	return isValid;

	}

	 

	@Override

	public List<User> getUser() {

	List<User> userList = dao.getUsers();

	return userList;

	}
}
