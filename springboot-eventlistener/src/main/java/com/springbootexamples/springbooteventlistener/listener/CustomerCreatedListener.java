package com.springbootexamples.springbooteventlistener.listener;

import com.springbootexamples.springbooteventlistener.event.CustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author mehmet
 */
@Component
public class CustomerCreatedListener {

    @EventListener
    public void handleCustomerCreatedEvent(CustomerEvent event) throws InterruptedException {
        System.out.println("Event is : " + event.getSource().toString());
    }

}
