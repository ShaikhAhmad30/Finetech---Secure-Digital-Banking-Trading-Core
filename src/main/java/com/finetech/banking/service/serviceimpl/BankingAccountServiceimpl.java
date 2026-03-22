package com.finetech.banking.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finetech.banking.service.dao.BankingAccountDao;
import com.finetech.banking.service.entity.FinetechBankingAccount;
import com.finetech.banking.service.service.BankingAccountService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class BankingAccountServiceimpl implements BankingAccountService {
	@Autowired
	BankingAccountDao dao;
	

	@Override
	public FinetechBankingAccount createAccount(long a_id, FinetechBankingAccount accountNumber) {
		// TODO Auto-generated method stub
		return dao.createAccount(a_id, accountNumber);
	}

	
	public FinetechBankingAccount getAccountById(Long accountId) {
		// TODO Auto-generated method stub
		return dao.getAccountById(accountId);
	}

	
	public List<FinetechBankingAccount> getAccountsByUserId(Long userId) {
		// TODO Auto-generated method stub
		return dao.getAccountsByUserId(userId);
	}

}
