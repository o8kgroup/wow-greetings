package com.o8k.wowgreetingskalimdor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Queueing {
    DIRECT_EXCHANGE(Constants.DIRECT_EXCHANGE),

    KALIMDOR_GREETINGS_QUEUE(Constants.KALIMDOR_GREETINGS_QUEUE),
    KALIMDOR_GREETINGS_BINDING_KEY(Constants.KALIMDOR_GREETINGS_BINDING_KEY);

    private final String value;

    public static class Constants {
        public static final String  DIRECT_EXCHANGE = "WOW-EXCHANGE";

        public static final String KALIMDOR_GREETINGS_QUEUE = "KALIMDOR-GREETINGS";
        public static final String KALIMDOR_GREETINGS_BINDING_KEY = "TO-KALIMDOR-GREETINGS-QUEUE";
    }
}
