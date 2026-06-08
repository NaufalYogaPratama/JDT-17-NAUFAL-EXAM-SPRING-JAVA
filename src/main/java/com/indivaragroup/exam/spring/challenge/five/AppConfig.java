package com.indivaragroup.exam.spring.challenge.five;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String applicationName() {
        return "Spring Basics Training";
    }
}
