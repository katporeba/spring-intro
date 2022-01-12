package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("messageService")
public class RandomTextMessageService implements MessageService{

    private final String[] strings = {"string1", "string2", "string3", "string4", "string5", "string6", "string7", "string8", "string9", "string10"};

    @Override
    public String getMessage() {
        int randomNumber = new Random().nextInt(this.strings.length);
        return this.strings[randomNumber];
    }
}
