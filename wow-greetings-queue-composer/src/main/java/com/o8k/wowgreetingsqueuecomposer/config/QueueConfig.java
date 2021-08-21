package com.o8k.wowgreetingsqueuecomposer.config;

import com.o8k.wowgreetingsqueuecomposer.enums.Queueing;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    @Bean
    public Queue kalimdorGreetingsQueue() {
        return QueueBuilder
                .durable(Queueing.KALIMDOR_GREETINGS_QUEUE.getValue())
                .build();
    }
}
