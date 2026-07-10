package com.javanauta.ts.events.notification;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

public record NotificationCompletedEvent(
        @NotNull UUID eventId,
        @NotNull Instant occurredAt,
        @NotBlank String taskId
) implements NotificationEvent {
    public static NotificationCompletedEvent create(String taskId) {
        return new NotificationCompletedEvent(
                UUID.randomUUID(),
                Instant.now(),
                taskId
        );
    }
}