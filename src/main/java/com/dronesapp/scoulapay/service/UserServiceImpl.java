package com.dronesapp.scoulapay.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dronesapp.scoulapay.model.User;
import com.dronesapp.scoulapay.repository.UserRespository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRepository;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		return userRepository.findAll();
	}

	@Override
	public User fetchUserById(Long userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}

//	@Override
//	public User updateUser(Long userId, User user) {
//		User userDB = userRepository.findById(userId).get();
//		
//		if(Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
//			userDB.setUserName(user.getUserName());
//		}
//		
//		if(Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
//			userDB.setUserName(user.getUserName());
//		}
//		
//		if(Objects.nonNull(user.getUserEmail()) && !"".equalsIgnoreCase(user.getUserEmail())) {
//			userDB.setUserEmail(user.getUserEmail());
//		}
//		
//		if(Objects.nonNull(user.getUserPhoneNo()) && !"".equalsIgnoreCase(user.getUserPhoneNo())) {
//			userDB.setUserPhoneNo(user.getUserPhoneNo());
//		}
//		
//		return userRepository.save(user);
//	}

	@Override
	public User getUserByName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public User updateUser(Long userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
