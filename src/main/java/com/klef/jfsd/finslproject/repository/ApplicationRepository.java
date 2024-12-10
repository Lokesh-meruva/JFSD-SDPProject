package com.klef.jfsd.finslproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.finslproject.models.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long>{
	List<Application> findByEmail(String email);

}
