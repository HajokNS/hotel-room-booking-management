package com.hajokns.RoomAggregate;

import com.hajokns.RoomAggregate.events.RoomBookedEvent;
import com.hajokns.RoomAggregate.events.RoomCheckedInEvent;
import com.hajokns.utils.events.Event;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class HotelBooking {
    private final UUID id;
    private final String roomId;
    private final String guestName;
    private final List<Event> domainEvents = new ArrayList<>();

    public HotelBooking(UUID id, String roomId, String guestName) {
        this.id = id;
        this.roomId = roomId;
        this.guestName = guestName;
    }

    public UUID getId() {
        return id;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public List<Event> getEvents() {
        return Collections.unmodifiableList(domainEvents);
    }

    public void bookRoom() {
        RoomBookedEvent roomBookedEvent = new RoomBookedEvent(roomId, guestName);
        addDomainEvent(roomBookedEvent);
    }

    public void checkIn() {
        RoomCheckedInEvent roomCheckedInEvent = new RoomCheckedInEvent(roomId, guestName);
        addDomainEvent(roomCheckedInEvent);
    }

    private void addDomainEvent(Event event) {
        domainEvents.add(event);
    }

    public void clearDomainEvents() {
        domainEvents.clear();
    }
}

