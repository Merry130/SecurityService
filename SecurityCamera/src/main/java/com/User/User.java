package com.User;

import java.util.List;

import com.Alert.Alert;
import com.Camera.Camera;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long UserId;
	private String UserName;

	public User() {

	}

	@OneToMany(mappedBy = "UserId")
	private List<Camera> Cameras;
	private List<Alert> Alerts;

	public List<Alert> getAlerts() {
		return Alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		Alerts = alerts;
	}

	public User(String userName, List<Camera> cameras, List<Alert> alerts) {
		super();
		UserName = userName;
		Cameras = cameras;
		Alerts = alerts;
	}

	public List<Camera> getCameras() {
		return Cameras;
	}

	public void setCameras(List<Camera> cameras) {
		Cameras = cameras;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

}
