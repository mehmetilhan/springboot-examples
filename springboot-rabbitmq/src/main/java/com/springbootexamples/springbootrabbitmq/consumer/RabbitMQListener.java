package com.springbootexamples.springbootrabbitmq.consumer;

import com.springbootexamples.springbootrabbitmq.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author mehmet
 */
@Service
public class RabbitMQListener {

    @RabbitListener(queues = "custom-queue")
    public void handleMessage(CustomMessage message) {
        System.out.println("Message received..   " +message.toString());
    }
}
