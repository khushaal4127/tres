package com.kjrest.tres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjrest.tres.entity.User1;
import com.kjrest.tres.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User1> getAllUsers() {
		List<User1> uarray = new ArrayList<>();
		 userRepo.findAll()
		 .forEach(uarray::add);
		 return uarray;	 		
	}
	
	public void addUser(User1 user) {
		userRepo.save(user);
	}
	
	public void updateUser(int user_id_in,User1 user) {
		userRepo.save(user);
	}
	
	public void deleteUser(int user_id_in) {
		userRepo.deleteById(user_id_in);
	}

}
