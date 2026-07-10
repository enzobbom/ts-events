package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.Event;

public sealed interface NotificationEvent
        extends Event
        permits NotificationRequestEvent, NotificationCompletedEvent, NotificationFailedEvent {

    public String taskId();
}
