package com.finetech.banking.service.service;

import java.util.List;

import com.finetech.banking.service.entity.FinetechBankingAccount;

public interface BankingAccountService {
FinetechBankingAccount createAccount(long a_id, FinetechBankingAccount accountNumber);

FinetechBankingAccount getAccountById(Long accountId);

List<FinetechBankingAccount> getAccountsByUserId(Long userId);
}
