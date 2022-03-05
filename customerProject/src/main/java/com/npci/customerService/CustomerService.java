package com.npci.customerService;

import java.util.List;


//import com.npci.customerController.Customers;
import com.npci.customerEntity.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	//public Customer addOrUpdateCustomer(Customer customer);
//	public Customers deleteCustomer(int Id) ;
//	public Customer getCustomerById(Customer customers);
//	Customer getCustomerById(Customer Id);
	Customer getCustomerById(int Id) throws Exception;
//	Customer getCustomerById1(Customer customer);
//	Customer addOrUpdateCustomer(Customer customer);
//	Customer deleteCustomer(int Id) throws Exception;
	//Customer getCustomerById(Customer Id) throws Exception;
	public Customer deleteCustomer(int id) throws Exception;
}
