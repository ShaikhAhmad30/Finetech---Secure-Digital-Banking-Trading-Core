package com.finetech.banking.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finetech.banking.service.entity.FintechBankingTransaction;
import com.finetech.banking.service.service.BankingTransactionService;

@RestController
@RequestMapping("/transactonservice")
public class BankingTransactionController {
	@Autowired
    private BankingTransactionService transactionService;

    @PostMapping("/process")
    public ResponseEntity<?> createTransaction(@RequestBody FintechBankingTransaction request) {

        FintechBankingTransaction txn =
                transactionService.processTransaction(request);

        return ResponseEntity.ok(txn);
    }

}
