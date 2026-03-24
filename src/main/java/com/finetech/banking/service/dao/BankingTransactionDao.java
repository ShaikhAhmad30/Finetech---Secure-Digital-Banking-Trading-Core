package com.finetech.banking.service.dao;

import com.finetech.banking.service.entity.FintechBankingTransaction;

public interface BankingTransactionDao {
	FintechBankingTransaction save(FintechBankingTransaction txn);
}
