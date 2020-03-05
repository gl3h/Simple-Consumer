package com.example.consumer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerExampleApplication.class, args);
	}

}
