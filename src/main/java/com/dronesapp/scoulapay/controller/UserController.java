package com.dronesapp.scoulapay.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dronesapp.scoulapay.model.User;
import com.dronesapp.scoulapay.service.UserService;
import com.dronesapp.scoulapay.service.UserServiceImpl;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/test")
	public String test() {
		return "hello world";
	}
	
	@PostMapping("/create_user")
	public User saveUser(@Validated @RequestBody User user) {
		LOGGER.info("this is a save endpoint" + user);
		return userService.saveUser(user);
	}

	@GetMapping("/get_all_users") 
	public List<User> getUsers() {
		LOGGER.info("this is a get all endpoint");
		return userService.fetchUserList();
	}
	
	@GetMapping("/get_one_user/{id}")
	public User fetchUserById(@PathVariable ("id") Long userId) {
		return userService.fetchUserById(userId);
	}
	
	@DeleteMapping("/delete_user/{id}")
	public String deleteUserById(@PathVariable ("id") Long userId) {
		userService.deleteUserById(userId);
		return "User deleted successfully";
	}
	
	@PutMapping("/update_user/{id}")
	public User updateUser(@PathVariable("id") Long userId, @RequestBody User user) {
		return userService.updateUser(userId, user);
	}
	
	@GetMapping("/get_name/{name}")
	public User getUserByName(@PathVariable("name") String userName) {
		return userService.getUserByName(userName);
	}
}
