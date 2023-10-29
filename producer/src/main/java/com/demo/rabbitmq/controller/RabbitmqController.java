package com.demo.rabbitmq.controller;

import com.demo.rabbitmq.service.RabbitmqService;
import com.demo.rabbitmq.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/send")
public class RabbitmqController {

    @Autowired
    RabbitmqService rabbitmqService;

    @GetMapping
    public Message send(Message message) {
        rabbitmqService.addQueue(message);
        return message;
    }
}
