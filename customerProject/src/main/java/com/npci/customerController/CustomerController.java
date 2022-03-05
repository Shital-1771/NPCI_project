package com.npci.customerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.customerEntity.Customer;
import com.npci.customerService.CustomerService;

//import lombok.Data;
//
//@Data
@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;


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

	
//	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int custId) {
//        Customer customer = null;
//
//        try {
//            customer = customerService.getCustomerById(custId);
//        } catch (Exception ex) {
//            ex.getMessage();
//        }
//        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
//    }
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int Id) {

		Customer customers = null;
        try {

			customers = customerService.getCustomerById(Id);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customer>(customers, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<Customer> deleteUserById(@PathVariable("id") int Id) {
		Customer users = null;

 

        try {
            users = customerService.deleteCustomer(Id);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(users, HttpStatus.OK);
    }

}
