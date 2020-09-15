package com.first.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.demo.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);

	public User findByEmail(String email);
}
