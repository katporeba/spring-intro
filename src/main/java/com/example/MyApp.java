package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageServiceSecond = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageServiceSecond.getMessage());
        System.out.println("Hash code messageService: " + messageService.hashCode());
        System.out.println("Hash code messageServiceSecond: " + messageServiceSecond.hashCode());

        applicationContext.close();
    }
}
