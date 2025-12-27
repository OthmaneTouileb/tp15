package com.example.banque_service.dto;

import com.example.banque_service.entities.TypeTransaction;
import java.util.Date;

public record TransactionRequest(
        Long compteId,
        double montant,
        Date date,
        TypeTransaction type
) {
}
