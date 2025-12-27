package com.example.banque_service.dto;

public record TransactionStats(
        long count,
        double sumDepots,
        double sumRetraits
) {
}
