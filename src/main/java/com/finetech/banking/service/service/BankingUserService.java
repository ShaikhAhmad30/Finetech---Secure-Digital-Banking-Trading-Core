package com.finetech.banking.service.service;

import com.finetech.banking.service.entity.FinetechBankingUser;

public interface BankingUserService {
	FinetechBankingUser  registerUser(FinetechBankingUser user);
	FinetechBankingUser  getUserById (long  id);
	FinetechBankingUser  getUserByEmail(String email);
	 boolean authenticate(String email, String password);

}
