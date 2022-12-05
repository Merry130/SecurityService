package com.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Camera.Camera;
import com.User.User;
import com.UserRepository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	public Optional<User> findById(Integer UserId) {
		return userRepository.findById(UserId);
	}

	public List<Camera> getCamerasByUser(Integer UserId) {
		return userRepository.getCamerasByUser(UserId);
	}

	
}
