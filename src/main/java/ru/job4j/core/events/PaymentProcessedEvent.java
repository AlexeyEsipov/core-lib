package ru.job4j.core.events;

import java.util.UUID;

public record PaymentProcessedEvent(UUID id, UUID orderId) {
}
