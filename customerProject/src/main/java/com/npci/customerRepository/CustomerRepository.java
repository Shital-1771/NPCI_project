package com.npci.customerRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.npci.customerEntity.Customer;



@Repository
public interface CustomerRepository  extends CrudRepository<Customer ,Integer>{

//	@Query
//	(value = "select * from user where Id >:Id",nativeQuery =true)

//		Optional<Customer> findById(Customer id);

}
