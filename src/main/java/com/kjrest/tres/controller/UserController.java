package com.kjrest.tres.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kjrest.tres.entity.User1;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/all")
	public List<User1> getAllUsers_(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST , value ="/add")
	public void addUser_(@RequestBody User1 user){
		 userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/update/{id}")
	public void updateUser_(@RequestBody User1 user , @PathVariable int id){
		 userService.updateUser(id,user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/update/{id}")
	public void deleteUser_(@PathVariable int id){
		 userService.deleteUser(id);
	}
	

}
