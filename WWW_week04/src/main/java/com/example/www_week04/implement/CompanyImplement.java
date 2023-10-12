package com.example.www_week04.implement;

import com.example.www_week04.entities.Company;
import com.example.www_week04.repositories.CompanyRepository;
import com.example.www_week04.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CompanyImplement implements CompanyService {
    @Autowired
    private CompanyRepository repo;

    @Override
    public List<Company> getAll() {
        return repo.findAll();
    }
}
