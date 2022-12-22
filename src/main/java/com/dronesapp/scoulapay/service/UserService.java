package com.dronesapp.scoulapay.service;

import java.util.List;

import com.dronesapp.scoulapay.model.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> fetchUserList();

	public User fetchUserById(Long userId);

	public void deleteUserById(Long userId);

	public User updateUser(Long userId, User user);

	public User getUserByName(String userName);

}
