//package com.npci.customerController;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.npci.customerEntity.Customer;
//import com.npci.customerRepository.CustomerRepository;
//
//@RestController
//@RequestMapping("/security")
//
//public class AdminController {
//
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	@PostMapping("admin/add")
//	public String addUser( @RequestBody Customer customer)
//	{
//		
//		String pwd=customer.getPassword();
//		String encryptedPwd = passwordEncoder.encode(pwd);
//		customer.setPassword(encryptedPwd);
//		customerRepository.save(customer);
//		return "user added Successfully";
//	}
//	
//}
