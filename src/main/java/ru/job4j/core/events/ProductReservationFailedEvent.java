package ru.job4j.core.events;

import java.util.UUID;

public record ProductReservationFailedEvent(UUID orderId, UUID productId, Integer productQuantity) {
}
