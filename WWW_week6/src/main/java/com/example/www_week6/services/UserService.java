package com.example.www_week6.services;

import com.example.www_week6.models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    User save(User u);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
}
