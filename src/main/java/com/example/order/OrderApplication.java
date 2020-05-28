package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableBinding({Source.class, Sink.class})
public class OrderApplication {
	public static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(OrderApplication.class, args);
	}
}
