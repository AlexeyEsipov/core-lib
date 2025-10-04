package ru.job4j.core.sagadto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.math.BigInteger;

public record CreditCardProcessRequest(
        @NotNull
        @Positive
        BigInteger creditCardNumber,
        @NotNull
        @Positive
        BigDecimal paymentAmount
) {}
