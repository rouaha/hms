package com.abi.repository;



import com.abi.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abi.entity.User;

import java.util.List;

@Component
public class UserRepository {
	
	@Autowired
	UserRepo userRepo;


	public List<User> getUserList(){
		return (List<User>) userRepo.findAll();
	}
	public void addUser(User user){
		userRepo.save(user);
	}



}
