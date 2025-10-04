package ru.job4j.core.command;


import ru.job4j.core.sagadto.OrderStatus;

import java.util.UUID;

public record OrderHistoryCommand(UUID orderId, OrderStatus orderStatus) {
}
