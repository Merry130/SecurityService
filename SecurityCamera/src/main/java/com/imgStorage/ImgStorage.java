package com.imgStorage;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Photo.photo;
@Repository
public interface ImgStorage extends JpaRepository<photo, String>{

}
