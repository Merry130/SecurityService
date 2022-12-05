package com.CameraRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Camera.Camera;
import com.User.User;

public interface CameraRepository extends CrudRepository <Camera,Integer>{
	List<User> getUsersByCamera(Integer CameraId);

}
