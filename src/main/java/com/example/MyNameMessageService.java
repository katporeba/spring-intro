package com.example;

import org.springframework.stereotype.Component;

@Component()
public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Katarzyna Poręba";
    }
}
