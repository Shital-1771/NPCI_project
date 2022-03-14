package com.npci.customerService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npci.customerEntity.Transaction;

@Service
public interface Transactionservice {

		public List<Transaction> getAllTransaction();
		public Transaction addTransaction(Transaction transaction) throws Exception;
        public Transaction getTransById(int serialId);
//		Transaction addTransaction(Transaction transaction) throws Exception;

}
