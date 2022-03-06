package com.npci.customerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.npci.customerEntity.Transaction;

@Repository
public interface TransRepository extends JpaRepository<Transaction, Integer> {

	
    	@Modifying
    	@Query(value = " update customer set customer.acc_balance =(customer.acc_balance)-(:Tamount) where customer.c_id=:tocustId; ",nativeQuery = true )
   	public Transaction updateBalanceFromCustomer(@RequestBody Transaction transaction);

       @Modifying
   @Query(value = " update customer set customer.acc_balance =(customer.acc_balance)+(:TAmount) where customer.c_id=:tocustId; ",nativeQuery = true )
	   public Transaction updateBalanceToCustomer(@RequestBody Transaction transaction);


}


