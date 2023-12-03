package com.example.www_week5.services;

import com.example.www_week5.entities.Address;
import com.example.www_week5.entities.Company;
import com.example.www_week5.entities.Skill;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {
    List<Address> getAll();
    Optional<Address> findbyId(Long id);

    List<Address> getbyCountId(Long id);
}
