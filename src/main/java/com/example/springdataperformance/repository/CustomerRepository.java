package com.example.springdataperformance.repository;

import com.example.springdataperformance.entity.Customer;
import com.example.springdataperformance.type.CustomerType;
import com.example.springdataperformance.type.PhoneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByName(String name);

    List<Customer> findAllByCustomerType(CustomerType customerType);

    List<Customer> findAllByPhoneType(PhoneType phoneType);
}
