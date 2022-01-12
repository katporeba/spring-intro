package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        MessageService messageServiceFirst = applicationContext.getBean("messageServiceRandom", MessageService.class);
        MessageService messageServiceSecond = applicationContext.getBean("messageServiceRandom", MessageService.class);

        System.out.println(messageService.getMessage());

        System.out.println(messageServiceFirst.getMessage());
        System.out.println(messageServiceSecond.getMessage());
        System.out.println("Hash code messageServiceFirst: " + messageServiceFirst.hashCode());
        System.out.println("Hash code messageServiceSecond: " + messageServiceSecond.hashCode());

        applicationContext.close();
    }
}
