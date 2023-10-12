package com.example.www_week04.services;

import com.example.www_week04.entities.Diachi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {
    List<Diachi> getAll();
   Optional<Diachi> find(Long id);
    Diachi Create(Diachi diachi);
}
