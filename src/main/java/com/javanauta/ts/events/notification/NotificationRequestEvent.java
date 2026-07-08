package com.javanauta.ts.events.notification;

import java.time.Instant;
import java.util.UUID;
import com.javanauta.ts.events.shared.Event;

public record NotificationRequestEvent(
        UUID eventId,
        Instant occurredAt,
        String taskId,
        String taskName,
        String taskDescription,
        Instant taskScheduledDateTime,
        String taskRecipient,
        String taskZoneId
) implements Event {
    public static NotificationRequestEvent create(String taskId,
                                                  String taskName,
                                                  String taskDescription,
                                                  Instant taskScheduledDateTime,
                                                  String taskRecipient,
                                                  String taskZoneId) {
        return new NotificationRequestEvent(
                UUID.randomUUID(),
                Instant.now(),
                taskId,
                taskName,
                taskDescription,
                taskScheduledDateTime,
                taskRecipient,
                taskZoneId
        );
    }
}
