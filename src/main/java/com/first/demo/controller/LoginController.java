package com.first.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first.demo.model.User;
import com.first.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/userRegister")
	public ResponseEntity<List<String>> userRegister(@RequestBody User user) {
		String responseString = loginService.userCreate(user);
		List<String> responseLIst = new ArrayList<>();
		responseLIst.add(responseString);
		return new ResponseEntity<>(responseLIst, HttpStatus.OK);
	}

	@PostMapping("/loginUser")
	public boolean loginUser(@RequestBody User user) {
		boolean isLoggedIn = false;
		if (user != null) {
			isLoggedIn = loginService.loginUser(user);
			return isLoggedIn;
		} else {
			return isLoggedIn;
		}
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		System.out.println("cmuihwyywrgryggrtg");
		return loginService.userRetrivelAll();
	}

	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user, @PathVariable String userName) {
		User fromDbUser = loginService.findByUserName(userName);
		if (fromDbUser != null) {
			user.setId(fromDbUser.getId());
			user.setUserName(userName);
			loginService.userCreate(user);
		} else {
			return null;
		}
		return user;
	}

	@DeleteMapping("/delete")
	public void delerteByIdCon(@RequestParam Long id) {
		loginService.deleById(id);
	}
}
