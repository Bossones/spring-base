package ru.bossones.events.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import ru.bossones.events.events.BlockedListEvent;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {

    private List<String> emailBlockedList;
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setEmailBlockedList(List<String> emailBlockedList) {
        this.emailBlockedList = emailBlockedList;
    }

    public void sendEmail(String address, String content) {
        if (emailBlockedList.contains(address)) {
            applicationEventPublisher.publishEvent(new BlockedListEvent(this, address, content));
            return;
        }
    }
}
