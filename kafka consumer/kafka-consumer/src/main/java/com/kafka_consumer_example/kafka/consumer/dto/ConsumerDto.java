package com.kafka_consumer_example.kafka.consumer.dto;

import lombok.Data;

@Data
public class ConsumerDto {

    private Integer id;
    private String name;
    private String email;
    private String address;
}
