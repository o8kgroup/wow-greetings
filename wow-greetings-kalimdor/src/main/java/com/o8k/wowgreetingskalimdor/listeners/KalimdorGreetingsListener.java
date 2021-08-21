package com.o8k.wowgreetingskalimdor.listeners;

import com.o8k.wowgreetingskalimdor.enums.Queueing;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KalimdorGreetingsListener {
    @RabbitListener(queues = {Queueing.Constants.KALIMDOR_GREETINGS_QUEUE})
    public void listen(String message) {
        log.info(String.format("Mensagem reciba na fila -> %s", Queueing.Constants.KALIMDOR_GREETINGS_QUEUE));
        log.info(String.format("Conteúdo -> %s", message));
    }
}
