package com.training.web.service;

import java.util.Date;
import java.util.List;

import com.training.web.model.User;

public interface LoginService {
 boolean isValidUser(String username,String password,Date date1);
 List<User> getUser();
	
	
}
