package com.globallogic.creditcardpayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.creditcardpayment.entity.Customer;
import com.globallogic.creditcardpayment.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.showCustomer();
	}
	
	@GetMapping("/getCustomerById/{custId}")
	public Customer showCustomerById(@PathVariable("custId") long custId) {
		return customerService.showCustomerById(custId);
	}

	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") long id) {
		return customerService.deleteCustomer(id);
	}

}
