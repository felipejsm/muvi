package com.muvi.api.usecases;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMovie {
    @KafkaListener(topics = "${movie.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String order) {
        System.out.println("Order: "+order);
    }
}
