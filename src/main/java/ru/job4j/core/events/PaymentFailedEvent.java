package ru.job4j.core.events;

import java.util.UUID;

public record PaymentFailedEvent(UUID orderId, UUID productId, Integer productQuantity) {
}
