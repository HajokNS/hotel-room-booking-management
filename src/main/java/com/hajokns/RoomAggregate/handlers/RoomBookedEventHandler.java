package com.hajokns.RoomAggregate.handlers;


import com.hajokns.RoomAggregate.events.RoomBookedEvent;
import com.hajokns.utils.handlers.EventHandler;

public class RoomBookedEventHandler implements EventHandler<RoomBookedEvent> {
    @Override
    public void handle(RoomBookedEvent event) {
        System.out.println("Підтвердження бронювання для гостя: " + event.getGuestName());
        System.out.println("Номер: " + event.getRoomId() + ", Дата бронювання: " + event.getOccuredOn().toString());
    }
}
