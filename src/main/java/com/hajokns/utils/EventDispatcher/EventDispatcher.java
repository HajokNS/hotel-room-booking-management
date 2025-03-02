package com.hajokns.utils.EventDispatcher;

import com.hajokns.utils.events.Event;
import com.hajokns.utils.handlers.EventHandler;

public interface EventDispatcher {

    <T extends Event> void registerHandler(Class<T> eventType, EventHandler<T> handler);

    void dispatch(Event event);
}
