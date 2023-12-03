package com.example.www_week5.implement;

import com.example.www_week5.entities.User;
import com.example.www_week5.repository.UserRepo;
import com.example.www_week5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserImple implements UserService {
    @Autowired
    private UserRepo repo;

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<User> findbyId(Long id) {
        return repo.findById(id);
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public Optional<User> findbyName(String name) {
        return repo.findByUserName(name);
    }
}
