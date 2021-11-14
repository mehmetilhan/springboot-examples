package com.springbootexamples.springbootrabbitmq.producer;

import com.springbootexamples.springbootrabbitmq.model.CustomMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mehmet
 */
@Service
public class RabbitMQProducer {

    @Value("${rabbitmq.routing.name}")
    private String routingName;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToQueue(CustomMessage message) {
        rabbitTemplate.convertAndSend(exchangeName, routingName, message);
        System.out.println("Message sent : " + message.getMessage());

    }
}
