package com.example.www_week04.implement;

import com.example.www_week04.entities.Diachi;
import com.example.www_week04.repositories.AddressReoisitory;
import com.example.www_week04.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AddressImplement implements AddressService {
    @Autowired
    private AddressReoisitory repo;

    @Override
    public List<Diachi> getAll() {
        return repo.findAll();
    }

    @Override
    public java.util.Optional<Diachi> find(Long id) {
        return  repo.findById(id);
    }

    @Override
    public Diachi Create(Diachi diachi) {
       return  repo.save(diachi);
    }

}
