package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.notification.enums.NotificationFailureType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

public record NotificationFailedEvent(
        @NotNull UUID eventId,
        @NotNull Instant occurredAt,
        @NotBlank String taskId,
        @NotNull NotificationFailureType failureType,
        @NotBlank String error
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