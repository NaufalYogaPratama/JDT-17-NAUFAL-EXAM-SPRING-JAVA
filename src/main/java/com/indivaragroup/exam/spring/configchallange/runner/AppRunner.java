package com.indivaragroup.exam.spring.configchallange.runner;

import com.indivaragroup.exam.spring.configchallange.service.GreetingMessageService;
import com.indivaragroup.exam.spring.configchallange.service.ResourceReaderService;
import com.indivaragroup.exam.spring.configchallange.service.StoreInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {
    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    @Override
    public void run(String... args) {
        System.out.println("=== CONFIG CHALLENGE: Mini Store ===");

        // 1. Print banner
        System.out.println(resourceReaderService.readBanner());
        System.out.println();

        // 2. Print store info
        System.out.println(storeInfoService.getStoreInfoString());
        System.out.println();

        // 3. Print greeting EN
        System.out.println("[EN] " + greetingMessageService.getGreeting(Locale.ENGLISH));
        System.out.println(greetingMessageService.getStatus(Locale.ENGLISH));
        System.out.println();

        // 4. Print greeting ID
        System.out.println("[ID] " + greetingMessageService.getGreeting(new Locale("id")));
        System.out.println(greetingMessageService.getStatus(new java.util.Locale("id")));
        System.out.println();
    }
}
