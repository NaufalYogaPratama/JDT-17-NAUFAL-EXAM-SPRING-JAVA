package com.indivaragroup.exam.spring.challenge.two;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    @Bean
    public String getMessage() {
        return "Welcome to String";
    }
}
