package com.UserController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Camera.Camera;
import com.User.User;
import com.UserService.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/User")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/User/{UserId}")
	public Optional<User> findById(@PathVariable("UserId") Integer UserId) {
		return userService.findById(UserId);
	}

	@GetMapping("/User/{UserId}/Camera")
	public List<Camera> getCamerasByUser(@PathVariable("UserId") Integer UserId) {
		return userService.getCamerasByUser(UserId);

	}

}
