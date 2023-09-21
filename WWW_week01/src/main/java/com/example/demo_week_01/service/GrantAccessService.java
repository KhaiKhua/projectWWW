package com.example.demo_week_01.service;

import com.example.demo_week_01.models.GrantAccess;
import com.example.demo_week_01.resource.GranAccessRepository;

import jakarta.inject.Inject;

public class GrantAccessService {
    @Inject
    private GranAccessRepository repository;

    public boolean grantAccess(GrantAccess grantAccess) {
        return repository.CreatGrant(grantAccess);
    }
}
