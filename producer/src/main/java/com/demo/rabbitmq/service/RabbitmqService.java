package com.demo.rabbitmq.service;

import com.demo.rabbitmq.dto.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.binding}")
    private String binding;

    public void addQueue(Message message) {
        rabbitTemplate.convertAndSend(exchange, binding, message);
    }
}
