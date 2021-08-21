package com.o8k.wowgreetingsqueuecomposer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Queueing {
    KALIMDOR_GREETINGS_QUEUE("KALIMDOR-GREETINGS"),
    KALIMDOR_GREETINGS_BINDING_KEY("TO-KALIMDOR-GREETINGS-QUEUE"),

    DIRECT_EXCHANGE("WOW-EXCHANGE");

    private final String value;
}
