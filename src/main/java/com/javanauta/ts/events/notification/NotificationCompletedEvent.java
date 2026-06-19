package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.notification.enums.NotificationResult;
import com.javanauta.ts.events.shared.Event;

import java.time.Instant;
import java.util.UUID;

public record NotificationCompletedEvent(
        UUID eventId,
        Instant occurredAt,
        String taskId,
        NotificationResult result,
        String error
) implements Event {
}