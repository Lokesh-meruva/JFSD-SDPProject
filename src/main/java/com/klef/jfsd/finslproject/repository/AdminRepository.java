package com.klef.jfsd.finslproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.finslproject.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	Admin findByUsername(String username);

}
