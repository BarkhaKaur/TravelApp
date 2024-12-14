package com.project.simplilearn.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.simplilearn.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	Optional<Customer> findByCustomerName(String customerName);
}
