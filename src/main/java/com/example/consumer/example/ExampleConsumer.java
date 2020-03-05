package com.example.consumer.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleConsumer {

    @KafkaListener(topics = "data")
    public void processData(Data data) {
        System.out.println("Data:" + data);
    }
}
