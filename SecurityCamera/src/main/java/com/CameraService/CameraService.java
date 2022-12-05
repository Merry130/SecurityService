package com.CameraService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Camera.Camera;
import com.CameraRepo.CameraRepository;
import com.User.User;
@Service

public class CameraService {
	@Autowired
	private CameraRepository cameraRepo;


	
	public List<Camera> findAll() {
		return (List<Camera>) cameraRepo.findAll();
	}

	public Optional<Camera> findById(Integer CameraId) {
		return cameraRepo.findById(CameraId);
	}

	public List<User> getUsersByCamera(Integer CameraId) {
		return cameraRepo.getUsersByCamera(CameraId);
	}

}