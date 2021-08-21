package com.o8k.wowgreetingseasternkingdoms.controller;

import com.o8k.wowgreetingseasternkingdoms.enums.Queueing;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping
    public ResponseEntity<?> saluteKalimdor() {
        log.info(String.format(
                "Enviando mensagem para -> %s", Queueing.KALIMDOR_GREETINGS_BINDING_KEY.getValue())
        );
        rabbitTemplate.convertAndSend(
                Queueing.DIRECT_EXCHANGE.getValue(),
                Queueing.KALIMDOR_GREETINGS_BINDING_KEY.getValue(),
                "Anu Belore Dela'na"
        );

        return ResponseEntity.ok().build();
    }
}
