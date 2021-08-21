package com.o8k.wowgreetingsqueuecomposer.config;

import com.o8k.wowgreetingsqueuecomposer.enums.Queueing;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {
    @Autowired
    private Queue kalimdorGreetingsQueue;

    @Bean
    public Exchange directExchange() {
        return ExchangeBuilder
                .directExchange(Queueing.DIRECT_EXCHANGE.getValue())
                .durable(true)
                .build();
    }

    @Bean
    public Binding kalimdorGreetingsDirectBinding() {
        return BindingBuilder
                .bind(kalimdorGreetingsQueue)
                .to(directExchange())
                .with(Queueing.KALIMDOR_GREETINGS_BINDING_KEY.getValue())
                .noargs();
    }
}
