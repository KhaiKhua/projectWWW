package com.example.www_week04.repositories;

import com.example.www_week04.entities.Diachi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressReoisitory extends JpaRepository<Diachi,Long> {

}
