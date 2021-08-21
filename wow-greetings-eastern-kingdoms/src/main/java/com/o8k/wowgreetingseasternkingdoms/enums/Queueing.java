package com.o8k.wowgreetingseasternkingdoms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Queueing {
    DIRECT_EXCHANGE("WOW-EXCHANGE"),

    KALIMDOR_GREETINGS_BINDING_KEY("TO-KALIMDOR-GREETINGS-QUEUE");

    private final String value;
}
