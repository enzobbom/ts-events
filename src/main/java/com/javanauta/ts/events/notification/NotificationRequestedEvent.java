package com.javanauta.ts.events.notification;

import java.time.Instant;
import java.util.UUID;
import com.javanauta.ts.events.shared.Event;

public record NotificationRequestedEvent(
        UUID eventId,
        Instant occurredAt,
        String taskId,
        String taskName,
        String taskDescription,
        Instant taskScheduledDateTime,
        String taskRecipient,
        String taskZoneId
) implements Event {
}
