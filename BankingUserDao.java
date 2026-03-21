package com.finetech.banking.service.dao;

import com.finetech.banking.service.entity.FinetechBankingUser;

public interface BankingUserDao {
	FinetechBankingUser  registerUser(FinetechBankingUser user);
	FinetechBankingUser  getUserById (long  id);
	FinetechBankingUser  getUserByEmail(String email);
	 boolean authenticate(String email, String password);

}
