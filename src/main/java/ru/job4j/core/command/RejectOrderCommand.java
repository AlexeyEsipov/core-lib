package ru.job4j.core.command;

import java.util.UUID;

public record RejectOrderCommand(UUID orderId) {
}
