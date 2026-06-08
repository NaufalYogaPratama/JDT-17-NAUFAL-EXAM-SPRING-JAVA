package com.indivaragroup.exam.spring.challenge.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    @Bean
    public String sayHello() {
        return "Hello Spring";
    }
}
