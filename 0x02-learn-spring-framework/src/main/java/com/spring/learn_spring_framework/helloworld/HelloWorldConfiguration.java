package com.spring.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { }
record Address (String addressLine, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() { return "Sakhile III"; }
    @Bean
    public int age() { return 13; }

    @Bean
    @Primary
    public Person person() {
        return new Person("Ndlazi", 17, address());
    }

    @Bean
    public Person person2() {
        return new Person("Ndlazi", 17, new Address("1 Google Drive", "Randburg"));
    }

    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("1 HyperLoop Road", "Ares Haven");
    }
    @Bean()
    public Address address1() {
        return new Address("44 Sun Drive", "Venus");
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("address4qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean()
    @Qualifier("address4qualifier")
    public Address address4() {
        return new Address("44 Sun Drive", "Venus");
    }

}
