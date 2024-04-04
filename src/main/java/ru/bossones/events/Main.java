package ru.bossones.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bossones.events.config.EventConfig;
import ru.bossones.events.service.EmailService;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(EventConfig.class);

        var emailService = context.getBean(EmailService.class);
        // No event sent
        emailService.sendEmail("info@mail.ru", "testContent");
        // BlockEvent sent
        emailService.sendEmail("john_wick@google.com", "john_wick_content");
    }
}
