package com.PhotoController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Camera.Camera;
import com.Photo.photo;
import com.imgService.ServicePhoto;


@RestController

public class PhotoController {
@Autowired
	private ServicePhoto servicePhoto;

	public PhotoController(ServicePhoto servicePhoto) {
        this.servicePhoto=servicePhoto;
    }

	@PostMapping("/upload")
	public ResponseData uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
		photo phot = null;
		String downloadURl = "";
		phot =servicePhoto.savephoto(file);
		downloadURl = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").path(phot.getId())
				.toUriString();

		return new ResponseData(phot.getPhotoName(), downloadURl, file.getContentType(), file.getSize());
	}

	@GetMapping("/download/{fileId}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) throws Exception {
		photo photos = null;
		photos =servicePhoto.getphoto(fileId);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(photos.getPhotoType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + photos.getPhotoName() + "\"")
				.body(new ByteArrayResource(photos.getData()));
	}
	@GetMapping("/download/{fileId}/Camera")
	public List<Camera> getCamerasByphoto(@PathVariable("fileId") Integer fileId) {
		return servicePhoto.getCamerasByphoto(fileId);

	}
}