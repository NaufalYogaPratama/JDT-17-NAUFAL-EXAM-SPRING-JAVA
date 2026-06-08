package com.indivaragroup.exam.spring.challenge.seven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @PostConstruct
    public String showConnected(){
        return "Database Connected";
    }

    @PreDestroy
    public String showDisonnected() {
        return "Database Disconnected";
    }
}
