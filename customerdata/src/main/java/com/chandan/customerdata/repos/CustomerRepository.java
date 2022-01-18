package com.chandan.customerdata.repos;

import org.springframework.data.repository.CrudRepository;

import com.chandan.customerdata.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
