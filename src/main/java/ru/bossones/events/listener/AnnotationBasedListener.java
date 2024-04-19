package ru.bossones.events.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.bossones.events.events.BlockedListEvent;

@Component
public class AnnotationBasedListener {

    @EventListener(BlockedListEvent.class)
    public void listen(BlockedListEvent blockedListEvent) {
        System.out.println("The block list event has handled by annotation listener style!!");
    }
}
