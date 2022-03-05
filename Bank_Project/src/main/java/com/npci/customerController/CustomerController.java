package com.npci.customerController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.npci.customerEntity.Balance;
import com.npci.customerEntity.Customer;
import com.npci.customerEntity.Transaction;
//import com.npci.customerResponse.TransactionResponse;
import com.npci.customerService.CustomerService;
import com.npci.customerService.Transactionservice;
//
//import lombok.Data;
//
//@Data
@RestController
@RequestMapping("/Customer")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	   
	@Autowired
	private Transactionservice transactionService;

	
	
	@GetMapping("/allcustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = null;
		try {
			customers = customerService.getAllCustomers();
		} catch (Exception ex)

		{
			ex.getMessage();
		}

		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}


	
	@GetMapping("/getById/{id}")
	  @Cacheable(value = "Id", key = "#Id")
	public Customer getCustomerById(@PathVariable("id") int Id) throws Exception {

		Customer customers = null;
		customers = customerService.getCustomerById(Id);
		
		return customers;
	}
	
//	@GetMapping("/getById/{address}")
//	  @Cacheable(String = "address", key = "#address")
//	public Customer getCustomerByLocation(@PathVariable("address") String(address) throws Exception {
//
//		Customer customers = null;
//		customers = customerService.getCustomerByLocation(address);
//		
//		return customers;
//	}
	
	@PostMapping("/addcustomer") 
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
		Customer customers = null;
		
		try {
			customers = customerService.addcustomer(customer);
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return new ResponseEntity<Customer>(customers, HttpStatus.OK);
	}
	

	@DeleteMapping("/deleteCustomer/{id}")
	@CacheEvict(value = "customer", allEntries = true)
    public ResponseEntity<Customer> deleteUserById(@PathVariable("id") int Id) {
		
		Customer users = null;
     try {
            users = customerService.deleteCustomer(Id);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(users, HttpStatus.OK);
    }
	
	@GetMapping("/allTransactionDetails")
	public ResponseEntity<List<Transaction>> getAllTransaction() {
		List<Transaction> 	trans = null;
		try {
			trans = transactionService.getAllTransaction();
		} catch (Exception ex) {
			// TODO: handle exception
	//ex.getMessage();
		}
	return new ResponseEntity<List<Transaction>>(trans,HttpStatus.OK);
		
	}
	
	
	@PostMapping("/addtransaction") 
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction){
		Transaction trans = null;
		try {
			trans = transactionService.addTransaction(transaction);	
		} 
		catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Transaction>(trans, HttpStatus.OK);
	}
}