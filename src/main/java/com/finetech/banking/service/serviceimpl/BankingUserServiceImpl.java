package com.finetech.banking.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finetech.banking.service.dao.BankingUserDao;
import com.finetech.banking.service.entity.FinetechBankingUser;
import com.finetech.banking.service.service.BankingUserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BankingUserServiceImpl implements BankingUserService {
@Autowired BankingUserDao dao;
	@Override
	public FinetechBankingUser registerUser(FinetechBankingUser user) {
		// TODO Auto-generated method stub
		return dao.registerUser(user);
	}

	@Override
	public FinetechBankingUser getUserById(long id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	@Override
	public FinetechBankingUser getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getUserByEmail(email);
	}

	@Override
	public boolean authenticate(String email, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(email, password);
	}

}
