package com.finetech.banking.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finetech.banking.service.entity.FinetechBankingAccount;

@Repository
public interface BankingAccountRepo extends JpaRepository<FinetechBankingAccount, Long> {
	 FinetechBankingAccount findByAccountNumber(String accountNumber);
}

