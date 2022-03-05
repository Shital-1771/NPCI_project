package com.npci.customerService;

import java.util.List;

//import com.npci.customerEntity.Balance;
//import com.npci.customerController.Customers;
import com.npci.customerEntity.Customer;


public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	Customer getCustomerById(int Id) throws Exception;
	//Customer getCustomerByLocation(String address) throws Exception;
    public Customer deleteCustomer(int id) throws Exception;

	Customer addcustomer(Customer customer);

}
