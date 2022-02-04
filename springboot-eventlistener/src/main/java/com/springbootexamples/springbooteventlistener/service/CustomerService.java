package com.springbootexamples.springbooteventlistener.service;

import com.springbootexamples.springbooteventlistener.entity.Customer;
import com.springbootexamples.springbooteventlistener.event.CustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author mehmet
 */
@Service
public class CustomerService {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void createCustomer(Customer customer) throws InterruptedException {

        // Here we will have codes
        Thread.sleep(5000L);

        applicationEventPublisher.publishEvent(new CustomerEvent(customer));
    }

}
