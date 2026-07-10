package com.javanauta.ts.events.notification;

import java.time.Instant;
import java.util.UUID;

public interface Event {
    UUID eventId();
    Instant occurredAt();
}
