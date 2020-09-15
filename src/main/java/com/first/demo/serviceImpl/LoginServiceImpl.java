package com.first.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.first.demo.model.User;
import com.first.demo.repository.LoginRepository;
import com.first.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
 
	@Override
	public String userCreate(User user) {

		try {
			User userFromDb = loginRepository.findByEmail(user.getEmail());
			if(userFromDb == null) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String encodedPassword = passwordEncoder.encode(user.getPassword());
			System.out.println("Encoded Password is : " + encodedPassword);
			user.setPassword(encodedPassword);
			user = loginRepository.save(user);
			return "user registered successfully";
			}else {
				return "Please provide unique email";
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public boolean loginUser(User user) {
		boolean isPasswordMatch = false;
		try {
			User userFromDb = loginRepository.findByEmail(user.getEmail());
			if(userFromDb != null) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

			isPasswordMatch = passwordEncoder.matches(user.getPassword(), userFromDb.getPassword());
			System.out.println("Password match : " + isPasswordMatch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isPasswordMatch;
	}

	@Override
	public List<User> userRetrivelAll() {

		return loginRepository.findAll();
	}

	@Override
	public User findByUserName(String userName) {

		return loginRepository.findByUserName(userName);
	}

	@Override
	public void deleById(Long id) {
		// TODO Auto-generated method stub
		
	}


}
