package com.UserRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Camera.Camera;
import com.User.User;

public interface UserRepository extends CrudRepository <User,Integer>{
List<Camera> getCamerasByUser(Integer UserId);

}
