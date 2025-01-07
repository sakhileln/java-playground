package com.spring.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };
record Address (String addressLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() { return "Sakhile III"; }
    @Bean
    public int age() { return 13; }

    @Bean
    public Person person() {
        return new Person("Ndlazi", 17);
    }

    @Bean
    public Address address() {
        return new Address("1 HyperLoop Road", "Ares Haven");
    }
}
