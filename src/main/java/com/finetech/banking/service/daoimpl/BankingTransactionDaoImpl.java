package com.finetech.banking.service.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finetech.banking.service.dao.BankingTransactionDao;
import com.finetech.banking.service.entity.FintechBankingTransaction;
import com.finetech.banking.service.service.BankingTransactionService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class BankingTransactionDaoImpl implements BankingTransactionDao {

	@PersistenceContext
private EntityManager entityManager;

@Override
public FintechBankingTransaction save(FintechBankingTransaction txn) {
	 entityManager.persist(txn);
	 return txn;



}
}
