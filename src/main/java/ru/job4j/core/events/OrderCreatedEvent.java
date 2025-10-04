package ru.job4j.core.events;

import java.util.UUID;

public record OrderCreatedEvent(UUID orderId, UUID customerId, UUID productId, Integer productQuantity) {
}
