package com.npci.customerServiceImpl;

import java.util.List;


//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.npci.customerEntity.Customer;

import com.npci.customerException.ResourceNotFoundException;

import com.npci.customerRepository.CustomerRepository;

//import com.npci.customerRepository.TransRepository;


import com.npci.customerService.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {
//

	
	
	//@Autowired
//	private TransRepository transRepository;
	

	@Autowired CustomerRepository customerRepository;
	

	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();

	}

	@Override
    public Customer getCustomerById(int Id) throws Exception {
		// TODO Auto-generated method stub
	
	//return customerRepository.findById(Id).orElse(null);
		return customerRepository.findById(Id).orElseThrow(() 
				-> new ResourceNotFoundException("User not Found with id: " + Id));
	
	}
	
//	@Override
//    public Customer getCustomerByLocation(String address) throws Exception {
//		// TODO Auto-generated method stub
//	
//	//return customerRepository.findById(Id).orElse(null);
//		return customerRepository.findByLocation(address).orElseThrow(() 
//				-> new ResourceNotFoundException("User not Found with id: " + address));
//	
//	}
//	

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




	@Override
	public Customer addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}



}

