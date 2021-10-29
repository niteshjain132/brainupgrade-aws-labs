package com.brainupgrade.aws.springboot.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.brainupgrade.aws.springboot.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public List<Customer> findByFirstName(String firstName); 
}