package com.muvi.api.usecases;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Component
public class ProduceMovie {
    @Value("${movie.topic}")
    private String movieTopic;
    private KafkaTemplate kafkaTemplate;

    public ProduceMovie(final KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final @RequestBody String movie) {
        final String messageKey = UUID.randomUUID().toString();
        kafkaTemplate.send(movieTopic, messageKey, movie);
    }
}
