package com.example.www_week5.repository;

import com.example.www_week5.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
        @Query("select a.countryCode from Address a where a.id = :id")
        List<Address> getAddressByCountId(@Param("id") Long id);

}
