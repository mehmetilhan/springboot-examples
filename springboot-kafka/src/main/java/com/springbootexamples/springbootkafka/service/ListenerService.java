package com.springbootexamples.springbootkafka.service;

import com.springbootexamples.springbootkafka.dto.CustomMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author mehmet
 */

@Service
public class ListenerService {

    private static final String group = "${custom.kafka.group.id}";

    private static final String topic1 = "${custom.kafka.topic1}";

    private static final String topic2 = "${custom.kafka.topic2}";

    @KafkaListener(
            topics = topic1,
            groupId = group
    )
    public void listenTopicOne(@Payload CustomMessage message) {
        System.out.println("Received message to topic one is: " + message);
    }


    @KafkaListener(
            topics = topic2,
            groupId = group
    )
    public void listenTopicTwo(@Payload CustomMessage message) {
        System.out.println("Received message to topic two is: " + message);
    }


}
