package com.o8k.wowgreetingsqueuecomposer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
public class RabbitConfig {
    @Autowired
    private Queue kalimdorGreetingsQueue;
    @Autowired
    private Exchange directExchange;
    @Autowired
    private Binding kalimdorGreetingsDirectBinding;
    @Autowired
    private ConnectionFactory connectionFactory;

    @PostConstruct
    private void createRabbitElements() {
        log.info("Iniciando criação/update das filas...");

        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
        createExchange(rabbitAdmin);
        createGreetingsQueue(rabbitAdmin);

        log.info("Criação/update das filas finalizado.");
    }

    private void createExchange(RabbitAdmin rabbitAdmin) {
        rabbitAdmin.declareExchange(directExchange);
    }

    private void createGreetingsQueue(RabbitAdmin rabbitAdmin) {
        rabbitAdmin.declareQueue(kalimdorGreetingsQueue);
        rabbitAdmin.declareBinding(kalimdorGreetingsDirectBinding);
    }
}
