package com.example.consumer.example;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ExampleConsumer {

    @KafkaListener(topics = "${topic.name}", groupId = "${group.id}")
    public void processData(Data data) {
        System.out.println("Data:" + data);
    }

    @KafkaListener(topics = "${topic.name}", groupId = "${group.id}")
    public void processData(Object data) {
        System.out.println("Data:" + data);
    }
}