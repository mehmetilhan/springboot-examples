package com.springbootexamples.springbooteventlistener.entity;

import lombok.Data;

/**
 * @author mehmet
 */
@Data
public class Customer {

    private String name;

    private Boolean isActive = true;
}
