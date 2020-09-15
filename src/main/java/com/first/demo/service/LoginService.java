package com.first.demo.service;

import java.util.List;

import com.first.demo.model.User;

public interface LoginService {

	String userCreate(User user);

	List<User> userRetrivelAll();

	User findByUserName(String userName);

	void deleById(Long id);

	boolean loginUser(User user);

}
