package com.AlertRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Alert.Alert;
import com.User.User;

public interface AlertRepo extends CrudRepository<Alert, Integer>{
	List<User> getUsersByAlert(Integer AlertId);

}
