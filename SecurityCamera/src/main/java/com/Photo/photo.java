package com.Photo;

import org.hibernate.annotations.GenericGenerator;

import com.Camera.Camera;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "photo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class photo {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private Long PhotoId;
	private String PhotoName;
	private String PhotoType;
	@Lob
	private byte[] data;
	@ManyToOne
	@JoinColumn(name = "CameraId")
	private Camera camera;

	public photo(String PhotoName, String PhotoType, byte[] data) {
		super();
		this.PhotoName = PhotoName;
		this.PhotoType = PhotoType;
		this.data = data;
	}

	public Long getphotoId() {
		return PhotoId;
	}

	public void setPhotoId(Long photoId) {
		this.PhotoId = photoId;
	}

	public String getPhotoName() {
		return PhotoName;
	}

	public void setPhotoName(String photoName) {
		PhotoName = photoName;
	}

	public String getPhotoType() {
		return PhotoType;
	}

	public void setPhotoType(String photoType) {
		PhotoType = photoType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public String getId() {
		return PhotoName;
	}

}
