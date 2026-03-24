package com.finetech.banking.service.service;

import com.finetech.banking.service.entity.FintechBankingTransaction;

public interface BankingTransactionService {

    FintechBankingTransaction processTransaction(FintechBankingTransaction request);

}
