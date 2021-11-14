package com.springbootexamples.springbootrabbitmq.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author mehmet
 */
@Data
public class CustomMessage implements Serializable {
    private UUID id;
    private String message;
    private LocalDateTime dateTime;

    @Override
    public String toString() {
        return "CustomMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
