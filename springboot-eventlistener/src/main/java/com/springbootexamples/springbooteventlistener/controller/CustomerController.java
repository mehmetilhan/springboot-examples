package com.springbootexamples.springbooteventlistener.controller;

import com.springbootexamples.springbooteventlistener.entity.Customer;
import com.springbootexamples.springbooteventlistener.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mehmet
 */
@RestController
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @GetMapping("/create-customer")
    public String create() throws InterruptedException {
        System.out.println("Request is send!");
        Customer customer =new Customer();
        customer.setName("Mehmet");
        customerService.createCustomer(customer);
      return "Request is received!";
    }
}
