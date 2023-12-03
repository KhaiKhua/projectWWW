package com.example.www_week5.services;

import com.example.www_week5.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
   List<User> getAll();
   Optional<User> findbyId(Long id);
   User save (User user);
   Optional<User> findbyName(String Name);

}
