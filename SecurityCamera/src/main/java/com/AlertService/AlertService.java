package com.AlertService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Alert.Alert;
import com.AlertRepo.AlertRepo;
import com.User.User;

public class AlertService {
	@Autowired
	private AlertRepo alertRepo;


	
	public List<Alert> findAll() {
		return (List<Alert>) alertRepo.findAll();
	}

	public Optional<Alert> findById(Integer AlertId) {
		return alertRepo.findById(AlertId);
	}

	public List<User> getUsersByAlert(Integer AlertId) {
		return alertRepo.getUsersByAlert(AlertId);
	}
}
