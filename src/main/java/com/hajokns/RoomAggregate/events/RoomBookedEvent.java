package com.hajokns.RoomAggregate.events;

import com.hajokns.utils.events.Event;
import java.time.LocalDateTime;

public class RoomBookedEvent implements Event {
    private final String roomId;
    private final String guestName;

    public RoomBookedEvent(String roomId, String guestName) {
        this.roomId = roomId;
        this.guestName = guestName;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public LocalDateTime getOccuredOn() {
        return occurredOn;
    }
}
