package com.example.www_week5.implement;

import com.example.www_week5.entities.Address;
import com.example.www_week5.entities.Skill;
import com.example.www_week5.repository.AddressRepo;
import com.example.www_week5.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AddressImple implements AddressService {
    @Autowired
    private AddressRepo repo;


    @Override
    public List<Address> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Address> findbyId(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Address> getbyCountId(Long id) {
        return repo.getAddressByCountId(id);
    }
}
