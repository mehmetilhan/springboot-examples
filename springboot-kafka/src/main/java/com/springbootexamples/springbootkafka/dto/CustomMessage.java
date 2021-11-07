package com.springbootexamples.springbootkafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;


/**
 * @author mehmet
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomMessage {
    private String message;
}
