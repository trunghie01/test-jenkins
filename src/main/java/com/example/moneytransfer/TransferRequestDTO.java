package com.example.moneytransfer;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequestDTO {
    BigDecimal amount;
    String fromAccount;
    String toAccount;
}
