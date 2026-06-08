package com.indivaragroup.exam.spring.configchallenge;

import com.indivaragroup.exam.spring.configchallange.config.StoreProperties;
import com.indivaragroup.exam.spring.configchallange.service.GreetingMessageService;
import com.indivaragroup.exam.spring.configchallange.service.ResourceReaderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConfigChallengeTest {

    @Autowired
    private StoreProperties storeProperties;

    @Autowired
    private ResourceReaderService resourceReaderService;

    @Autowired
    private GreetingMessageService greetingMessageService;

    @Test
    void testStorePropertiesBinding() {
        assertNotNull(storeProperties);
        assertEquals("Indivara Mini Store", storeProperties.getName());
        assertEquals("Jakarta", storeProperties.getCity());
        assertEquals("IDR", storeProperties.getCurrency());
        assertEquals(100, storeProperties.getMaxDailyOrder());
        assertTrue(storeProperties.getActive());
    }

    @Test
    void testResourceReader() {
        String banner = resourceReaderService.readBanner();
        assertNotNull(banner);
        assertTrue(banner.contains("INDIVARA MINI STORE"));
    }

    @Test
    void testLocalizationGreetingAndStatus() {
        String enGreeting = greetingMessageService.getGreeting(Locale.ENGLISH);
        String enStatus = greetingMessageService.getStatus(Locale.ENGLISH);
        
        assertEquals("Welcome to Indivara Mini Store located in Jakarta", enGreeting);
        assertEquals("Store is currently active", enStatus);

        String idGreeting = greetingMessageService.getGreeting(new Locale("id"));
        String idStatus = greetingMessageService.getStatus(new Locale("id"));

        assertEquals("Selamat datang di Indivara Mini Store yang berlokasi di Jakarta", idGreeting);
        assertEquals("Toko sedang aktif", idStatus);
    }
}
