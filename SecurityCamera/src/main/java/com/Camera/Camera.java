package com.Camera;

import java.util.List;

import com.Photo.photo;
import com.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Camera")
public class Camera {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long CameraId;

	public Camera() {
	}

	@OneToMany(mappedBy = "CameraId")
	private List<photo> photos;
	@ManyToOne
	@JoinColumn(name = "UserId")
	private User user;

	public Camera( List<photo> photos, User user) {
		super();

		this.photos = photos;
		this.user = user;
	}

	public Long getCameraId() {
		return CameraId;
	}

	public void setCameraId(Long cameraId) {
		CameraId = cameraId;
	}

	public List<photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<photo> photos) {
		this.photos = photos;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
