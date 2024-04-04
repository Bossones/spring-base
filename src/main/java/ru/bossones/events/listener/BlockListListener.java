package ru.bossones.events.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import ru.bossones.events.events.BlockedListEvent;

@Component
public class BlockListListener implements ApplicationListener<BlockedListEvent> {

    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.println("BlockedListEvent is gained time: " + event.getTimestamp());
    }
}
