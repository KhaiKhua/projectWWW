package com.example.www_week04.controller;

import com.example.www_week04.entities.Company;
import com.example.www_week04.repositories.CompanyRepository;
import com.example.www_week04.services.CompanyService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
public class ControllerCompany {
    @Qualifier("companyImplement")
    @Autowired
    private CompanyService Companyservice;
    @GetMapping("/")
    public ResponseEntity<List<Company>> getAll(){
        List<Company> l = Companyservice.getAll();

        return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
    
}
