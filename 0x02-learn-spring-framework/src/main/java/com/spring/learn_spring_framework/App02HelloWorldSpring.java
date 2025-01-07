package com.spring.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Configure things we want spring to manage.
        // Done in HelloWordConfiguration

        // Retreive Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        // System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("address1"));
        System.out.println(context.getBean("person2"));
    }
}
