package com.AlertController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Alert.Alert;
import com.AlertService.AlertService;
import com.User.User;

public class AlertController {
	@Autowired
	private AlertService alertService;

	@GetMapping("/Alert")
	public List<Alert> findAll() {
		return alertService.findAll();
	}

	@GetMapping("/Camera/{AlertId}")
	public Optional<Alert> findById(@PathVariable("AlertId") Integer UserId) {
		return alertService.findById(UserId);
	}

	@GetMapping("/Camera/{AlertId}/User")
	public List<User> getUsersByCamera(@PathVariable("AlertId") Integer AlertId) {
		return alertService.getUsersByAlert(AlertId);

	}
}
