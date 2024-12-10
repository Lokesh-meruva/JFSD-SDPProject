package com.klef.jfsd.finslproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.klef.jfsd.finslproject.models.User;
import com.klef.jfsd.finslproject.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder1;

  
    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder1 = passwordEncoder;
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder1.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
