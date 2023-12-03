package com.example.www_week5.repository;

import com.example.www_week5.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo  extends JpaRepository<Company,Long> {

}
