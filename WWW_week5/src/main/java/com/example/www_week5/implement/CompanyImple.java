package com.example.www_week5.implement;

import com.example.www_week5.entities.Company;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.repository.CompanyRepo;
import com.example.www_week5.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class CompanyImple implements CompanyService {
    @Autowired
    private CompanyRepo repo;

    @Override
    public List<Company> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Company> findbyId(Long id) {
        return repo.findById(id);
    }



}
