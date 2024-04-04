package ru.bossones.events.config;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.bossones.events.service.EmailService;

import java.util.List;

@Configuration
@ComponentScan("ru.bossones.events")
public class EventConfig {

    @Bean
    public EmailService emailService(ApplicationEventPublisher applicationEventPublisher) {
        var service = new EmailService();
        List<String> blockedList = List.of("john_wick@google.com", "sam_tarley@outlook.com");
        service.setEmailBlockedList(blockedList);
        service.setApplicationEventPublisher(applicationEventPublisher);
        return service;
    }
}
