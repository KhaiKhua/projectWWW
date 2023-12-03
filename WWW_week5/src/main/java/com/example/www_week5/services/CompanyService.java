package com.example.www_week5.services;

import com.example.www_week5.entities.Company;
import com.example.www_week5.entities.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CompanyService {
    List<Company> getAll();
    Optional<Company> findbyId(Long id);

}
