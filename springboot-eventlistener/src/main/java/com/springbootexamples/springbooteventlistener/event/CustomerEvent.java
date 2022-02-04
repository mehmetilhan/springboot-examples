package com.springbootexamples.springbooteventlistener.event;

import com.springbootexamples.springbooteventlistener.entity.Customer;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author mehmet
 */

public class CustomerEvent extends ApplicationEvent{


    public CustomerEvent(Object obj) throws InterruptedException {
        super(obj);
    }

}
