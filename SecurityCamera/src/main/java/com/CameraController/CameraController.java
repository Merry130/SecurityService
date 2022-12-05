package com.CameraController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Camera.Camera;
import com.CameraService.CameraService;
import com.User.User;

@RestController
public class CameraController {
	@Autowired
	private CameraService cameraService;

	@GetMapping("/Camera")
	public List<Camera> findAll() {
		return cameraService.findAll();
	}

	@GetMapping("/Camera/{CameraId}")
	public Optional<Camera> findById(@PathVariable("CameraId") Integer UserId) {
		return cameraService.findById(UserId);
	}

	@GetMapping("/Camera/{CameraId}/User")
	public List<User> getUsersByCamera(@PathVariable("CameraId") Integer CameraId) {
		return cameraService.getUsersByCamera(CameraId);

	}
}