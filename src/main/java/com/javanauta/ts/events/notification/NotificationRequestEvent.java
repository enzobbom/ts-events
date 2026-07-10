package com.javanauta.ts.events.notification;

import com.javanauta.ts.events.notification.validation.ValidZoneId;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

public record NotificationRequestEvent(
        @NotNull UUID eventId,
        @NotNull Instant occurredAt,
        @NotBlank String taskId,
        @NotBlank String taskName,
        String taskDescription,
        @NotNull Instant taskScheduledDateTime,
        @NotBlank @Email String taskRecipient,
        @NotBlank @ValidZoneId String taskZoneId
) implements NotificationEvent {
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
