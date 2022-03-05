package com.npci.customerServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.npci.customerEntity.Customer;
import com.npci.customerRepository.CustomerRepository;
import com.npci.customerService.CustomerService;

@Service

public class CustomerServiceImpl<deletedCustomer> implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();

	}

//	@Override
//	public Customer addOrUpdateCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return customerRepository.save(customer);
//	}

	@Override

	public Customer getCustomerById(int Id) throws Exception {
		// TODO Auto-generated method stub
//		try {
//			Customer getCustomer = customerRepository.findById(Id).orElse(null);
//			if (getCustomer == null) {
//				throw new Exception("No such user");
//			} else {
//				 customerRepository.findById(Id);
//				
//			}
//		} catch (Exception ex) {
//			throw ex;
//
//		}
	return customerRepository.findById(Id).orElse(null);
	}

	@Override
	public Customer deleteCustomer(int id) throws Exception {
		// TODO Auto-generated method stub
		Customer deletedUser = null;
        try {
            deletedUser = customerRepository.findById(id).orElse(null);
            if (deletedUser == null) {
                throw new Exception("No such user");
            }
            else {
            	customerRepository.deleteById(id);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return null;
		
		
	}



}
