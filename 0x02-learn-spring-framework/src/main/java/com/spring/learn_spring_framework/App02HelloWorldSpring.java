package com.spring.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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
        System.out.println(context.getBean("address1"));
        System.out.println(context.getBean("person3"));

        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean("person4Qualifier"));

        // Print all beans
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
