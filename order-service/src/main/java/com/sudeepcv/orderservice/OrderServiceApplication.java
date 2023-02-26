package com.sudeepcv.orderservice;

import jakarta.annotation.PostConstruct;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {
	@Autowired
	private RabbitAdmin rabbitAdmin;
	@Value("${rabbitmq.queue.order.name}")
	private String orderQueueName;

	@Value("${rabbitmq.queue.email.name}")
	private String emailQueue;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@PostConstruct
	public void createQueues() {
		System.out.println("queue created...........................................................");
		Queue queue1 = new Queue(orderQueueName);
		rabbitAdmin.declareQueue(queue1);

		Queue queue2 = new Queue(emailQueue);
		rabbitAdmin.declareQueue(queue2);
	}

}
