package com.imgService;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Camera.Camera;
import com.Photo.photo;

public interface ServicePhoto {
	photo savephoto(MultipartFile file) throws Exception;

    photo getphoto(String fileId) throws Exception;

	List<Camera> getCamerasByphoto(Integer photoId);
}
