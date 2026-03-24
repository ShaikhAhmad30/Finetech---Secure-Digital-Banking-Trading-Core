package com.finetech.banking.service.dao;

import java.util.List;

import com.finetech.banking.service.entity.FinetechBankingAccount;

public interface BankingAccountDao {
	FinetechBankingAccount createAccount(long a_id, FinetechBankingAccount accountNumber);

	FinetechBankingAccount getAccountById(Long accountId);

	List<FinetechBankingAccount> getAccountsByUserId(Long userId);
	 FinetechBankingAccount findByAccountNumber(String accountNumber);
	 FinetechBankingAccount update(FinetechBankingAccount account);
}
