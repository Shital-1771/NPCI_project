package com.npci.customerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.npci.customerEntity.Customer;




@Repository
public interface CustomerRepository  extends JpaRepository<Customer ,Integer>{

	
	@Query(value = "Insert into customer(cname, age, address, cemail, cphone, acc_balance,password) values(?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	public Customer addCustomer(String cname, int age, String address, 
			String cEmail, long cPhone ,float accBalance,String password);



}
