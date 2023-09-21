package com.example.demo_week_01.service;


import com.example.demo_week_01.models.Role;
import com.example.demo_week_01.resource.RoleRepository;
import jakarta.inject.Inject;

import java.util.List;

public class RoleService {
    @Inject
    private RoleRepository repository;




    public List<Role> getAll() {
        return repository.getlisst();
    }


    public Role findById(String id) {
        return repository.find(id);
    }


    public boolean create(Role a) {
        return repository.CreatRole(a);
    }


    public boolean update(Role a) {
        return repository.Update(a);
    }

}
