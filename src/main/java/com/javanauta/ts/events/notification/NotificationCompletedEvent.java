package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.notification.enums.NotificationFailureType;
import com.javanauta.ts.events.shared.Event;

import java.time.Instant;
import java.util.UUID;

public record NotificationCompletedEvent(
        UUID eventId,
        Instant occurredAt,
        String taskId
) implements Event {
    public static NotificationCompletedEvent create(String taskId) {
        return new NotificationCompletedEvent(
                UUID.randomUUID(),
                Instant.now(),
                taskId
        );
    }
}