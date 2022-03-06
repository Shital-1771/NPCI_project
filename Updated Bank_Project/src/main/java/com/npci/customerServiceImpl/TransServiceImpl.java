package com.npci.customerServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.customerEntity.Customer;
import com.npci.customerEntity.Transaction;
import com.npci.customerRepository.CustomerRepository;
import com.npci.customerRepository.TransRepository;
import com.npci.customerService.Transactionservice;

@Service
public class TransServiceImpl implements Transactionservice {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private TransRepository transRepository;
	

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return (List<Transaction>) transRepository.findAll();
	}
	
	
	@Override
	public Transaction getTransById(int serialId) {
		// TODO Auto-generated method stub
		return transRepository.findById(serialId).orElse(null);
	}

//
//
	@Override
	public Transaction addTransaction(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		int cId = transaction.getFromCId();

       Customer entity = customerRepository.getById(cId);
		
		float customerBalance = entity.getABalance();
		float transAmount = transaction.getTamount();

		if (customerBalance >= transAmount) {

			// deduct sender customer balance
			entity.setABalance(customerBalance - transAmount);
			customerRepository.save(entity);
       System.out.println(customerBalance - transAmount);
			// add target customer balance
	      int cId2 = transaction.getToCId();
	      

			Customer entity2 = customerRepository.getById(cId2);
			entity2.setABalance(customerBalance + transAmount);
			customerRepository.save(entity2);
		} 
		else {
			// return "Insufficient Balance"
			throw new Exception("Insufficient Balance, Can't perform Transaction. ");
		}
		return transRepository.save(transaction);
	}
}

	



