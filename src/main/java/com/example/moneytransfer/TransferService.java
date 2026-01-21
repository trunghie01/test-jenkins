package com.example.moneytransfer;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class TransferService {

    public void transferMoney(TransferRequestDTO request) {
        // Validate
        if (request.getAmount() == null || request.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (request.getFromAccount() == null || request.getFromAccount().isEmpty()) {
             throw new IllegalArgumentException("From Account is required");
        }
        if (request.getToAccount() == null || request.getToAccount().isEmpty()) {
             throw new IllegalArgumentException("To Account is required");
        }

        // Simulate logic
        System.out.println("Processing transfer...");
        System.out.println("From: " + request.getFromAccount());
        System.out.println("To: " + request.getToAccount());
        System.out.println("Amount: " + request.getAmount());
        System.out.println("Transfer successful!");
    }
}
