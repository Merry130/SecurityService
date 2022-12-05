package com.PhotoController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {

//    public ResponseData(String photoName2, String downloadURl2, String contentType, long size) {
//	}
	private String PhotoName;
    public String getPhotoName() {
		return PhotoName;
	}
	public void setPhotoName(String photoName) {
		PhotoName = photoName;
	}
	public String getDownloadURL() {
		return downloadURL;
	}
	public void setDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
	}
	public String getPhotoType() {
		return PhotoType;
	}
	public void setPhotoType(String photoType) {
		PhotoType = photoType;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public ResponseData(String photoName, String downloadURL, String photoType, long fileSize) {
	super();
	PhotoName = photoName;
	this.downloadURL = downloadURL;
	PhotoType = photoType;
	this.fileSize = fileSize;
}
	private String downloadURL;
    private String PhotoType;
    private long fileSize;
}
