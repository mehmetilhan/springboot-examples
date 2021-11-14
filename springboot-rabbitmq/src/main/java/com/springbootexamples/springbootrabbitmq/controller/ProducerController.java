package com.springbootexamples.springbootrabbitmq.controller;

import com.springbootexamples.springbootrabbitmq.model.CustomMessage;
import com.springbootexamples.springbootrabbitmq.producer.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author mehmet
 */
@RestController
@RequestMapping
public class ProducerController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @GetMapping("/send-message/{msg}")
    public void sendMessage(@PathVariable String msg) {
        CustomMessage message=new CustomMessage();
        message.setId(UUID.randomUUID());
        message.setMessage(msg);
        message.setDateTime(LocalDateTime.now());
        rabbitMQProducer.sendToQueue(message);
    }
}
