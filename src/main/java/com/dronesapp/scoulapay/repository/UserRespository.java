package com.dronesapp.scoulapay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dronesapp.scoulapay.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
	
	public User findByUserName(String userName);

}
