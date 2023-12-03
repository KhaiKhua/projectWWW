package com.example.www_week6.implement;

import com.example.www_week6.models.User;
import com.example.www_week6.repository.UserRepo;
import com.example.www_week6.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserImple implements UserService {
    @Autowired
    private UserRepo repo;
    @Override
    public User save(User u) {
        return repo.save(u);
    }
    public Optional<User> findByEmail(String email){ return repo.findByEmail(email);}

    @Override
    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }
}
