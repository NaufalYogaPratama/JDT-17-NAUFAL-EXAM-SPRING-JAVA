package com.indivaragroup.exam.spring.challenge.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(MessageService.class)
public class GreetingServiceTwo {
    private final MessageService messageService;
    public GreetingServiceTwo(MessageService messageService) {
        this.messageService = messageService;
    }
    public void greet() {
        System.out.println(messageService.getMessage());
    }
}
