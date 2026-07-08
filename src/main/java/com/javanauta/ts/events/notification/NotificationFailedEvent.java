package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.notification.enums.NotificationFailureType;
import com.javanauta.ts.events.shared.Event;

import java.time.Instant;
import java.util.UUID;

public record NotificationFailedEvent(
        UUID eventId,
        Instant occurredAt,
        String taskId,
        NotificationFailureType failureType,
        String error
) implements Event {
    public static NotificationFailedEvent create(String taskId,
                                                 NotificationFailureType failureType,
                                                 String error) {
        return new NotificationFailedEvent(
                UUID.randomUUID(),
                Instant.now(),
                taskId,
                failureType,
                error
        );
    }
}