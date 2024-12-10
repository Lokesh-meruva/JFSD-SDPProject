package com.klef.jfsd.finslproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.finslproject.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);

}
