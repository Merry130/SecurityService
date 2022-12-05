package com.imgService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.Camera.Camera;
import com.Photo.photo;
import com.imgStorage.ImgStorage;

@Service
public class StorageService implements ServicePhoto {
	@Autowired
	private ImgStorage repository;
	 public StorageService(ImgStorage repository) {
	        this.repository = repository;
	    }

	    @Override
	    public photo savephoto(MultipartFile file) throws Exception {
	       String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	       try {
	            if(fileName.contains("..")) {
	                throw  new Exception("Filename contains invalid path sequence "
	                + fileName);
	                }
	            

	            photo pho
	                    = new photo(fileName,
	                    file.getContentType(),
	                    file.getBytes());
	            return repository.save(pho);

	       } catch (Exception e) {
	            throw new Exception("Could not save File: " + fileName);
	       }
	    }

	    @Override
	    public photo getphoto(String fileId) throws Exception {
	        return repository
	                .findById(fileId)
	                .orElseThrow(
	                        () -> new Exception("File not found with Id: " + fileId));
	    }

		@Override
		public List<Camera> getCamerasByphoto(Integer photoId) {		
			return getCamerasByphoto(photoId);
}
	}

