package com.demo.rabbitmq.dto;

import lombok.Data;

@Data
public class Message {
    private long keyId;
    private String message;
}
