package com.demo.rabbitmq.service;

import com.demo.rabbitmq.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {
    @RabbitListener(queues = "${rabbitmq.queue}"
                   ,containerFactory = "messageListenerContainerFactory")
    public void onMessage(Message message) {
        log.debug("message : {}", message);
    }
}
