package com.hajokns;

import com.hajokns.RoomAggregate.HotelBooking;
import com.hajokns.RoomAggregate.events.RoomBookedEvent;
import com.hajokns.RoomAggregate.events.RoomCheckedInEvent;
import com.hajokns.RoomAggregate.handlers.RoomBookedEventHandler;
import com.hajokns.RoomAggregate.handlers.RoomCheckedInEventHandler;
import com.hajokns.utils.EventDispatcher.EventDispatcher;
import com.hajokns.utils.EventDispatcher.SimpleEventDispatcher;

public class Main {

    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new SimpleEventDispatcher();

        eventDispatcher.registerHandler(RoomBookedEvent.class,
            new RoomBookedEventHandler());
        eventDispatcher.registerHandler(RoomCheckedInEvent.class,
            new RoomCheckedInEventHandler());

        HotelBooking hotelBooking = new HotelBooking(java.util.UUID.randomUUID(), "1", "Denus");

        hotelBooking.bookRoom();
        for (var event : hotelBooking.getEvents()) {
            eventDispatcher.dispatch(event);
        }
        hotelBooking.clearDomainEvents();

        hotelBooking.checkIn();
        for (var event : hotelBooking.getEvents()) {
            eventDispatcher.dispatch(event);
        }
        hotelBooking.clearDomainEvents();
    }
}