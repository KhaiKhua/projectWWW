package com.example.www_week04.services;

import com.example.www_week04.entities.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    List<Company> getAll();
}
