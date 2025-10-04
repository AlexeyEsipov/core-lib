package ru.job4j.core.command;

import java.util.UUID;

public record ReserveProductCommand(UUID productId, Integer productQuantity, UUID orderId) {
}
