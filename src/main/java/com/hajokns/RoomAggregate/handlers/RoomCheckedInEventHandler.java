package com.hajokns.RoomAggregate.handlers;

import com.hajokns.RoomAggregate.events.RoomCheckedInEvent;
import com.hajokns.utils.handlers.EventHandler;

public class RoomCheckedInEventHandler implements EventHandler<RoomCheckedInEvent> {
    @Override
    public void handle(RoomCheckedInEvent event) {
        System.out.println("Інформація про заселення:");
        System.out.println("Номер: " + event.getRoomId());
        System.out.println("Гість: " + event.getGuestName());
        System.out.println("Дата заселення: " + event.getOccuredOn().toString());
    }
}
