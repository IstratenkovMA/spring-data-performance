package com.example.springdataperformance.service;

import com.example.springdataperformance.entity.Customer;
import com.example.springdataperformance.repository.CustomerRepository;
import com.example.springdataperformance.type.CustomerType;
import com.example.springdataperformance.type.PhoneType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer getCustomerById(Long id) {
        return customerRepository.getReferenceById(id);
    }

    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }

    public List<Customer> getCustomersByType(CustomerType customerType) {
        return customerRepository.findAllByCustomerType(customerType);
    }

    public List<Customer> getCustomerByPhoneType(PhoneType phoneType) {
        return customerRepository.findAllByPhoneType(phoneType);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Transactional
    public Customer updateCustomerBalance(Long id, BigDecimal balance) {
        Customer customer = customerRepository.getReferenceById(id);
        customer.setBalance(balance);
        return customerRepository.save(customer);
    }
}
