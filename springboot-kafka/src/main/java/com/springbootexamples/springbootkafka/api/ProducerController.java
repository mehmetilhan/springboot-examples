package com.springbootexamples.springbootkafka.api;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootexamples.springbootkafka.dto.CustomMessage;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

/**
 * @author mehmet
 */

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class ProducerController {

    @Value("${custom.kafka.topic1}")
    private String topic1;

    @Value("${custom.kafka.topic2}")
    private String topic2;

    private final KafkaTemplate<String, CustomMessage> kafkaTemplate;

    @PostMapping("/send-topic-one")
    public void sendMessageOne(@RequestBody CustomMessage message) {
        kafkaTemplate.send(topic1, UUID.randomUUID().toString() ,message);
    }

    @PostMapping("/send-topic-two")
    public void sendMessageTwo(@RequestBody CustomMessage message) {
        kafkaTemplate.send(topic2,UUID.randomUUID().toString(), message);
    }
}