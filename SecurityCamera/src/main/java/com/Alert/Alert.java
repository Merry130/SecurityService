package com.Alert;

import com.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alert")
public class Alert {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long AlertId;
	private Boolean actionStatus;

	public Alert() {

	}

	@OneToOne(mappedBy = "AlertId")
	@ManyToOne
	@JoinColumn(name = "UserId")
	private User user;

	public Alert(Boolean actionStatus, User user) {
		super();

		this.actionStatus = actionStatus;
		this.user = user;

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getAlertId() {
		return AlertId;
	}

	public void setAlertId(Long alertId) {
		AlertId = alertId;
	}

	public Boolean getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(Boolean actionStatus) {
		this.actionStatus = actionStatus;
	}
}