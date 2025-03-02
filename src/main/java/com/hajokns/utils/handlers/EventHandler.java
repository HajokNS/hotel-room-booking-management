package com.hajokns.utils.handlers;

import com.hajokns.utils.events.Event;

public interface EventHandler<T extends Event> {

    void handle(T event);
}
