package com.finetech.banking.service.serviceimpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finetech.banking.service.dao.BankingAccountDao;
import com.finetech.banking.service.dao.BankingTransactionDao;
import com.finetech.banking.service.entity.FinetechBankingAccount;
import com.finetech.banking.service.entity.FintechBankingTransaction;
import com.finetech.banking.service.enums.TransactionStatus;
import com.finetech.banking.service.enums.TransactionType;
import com.finetech.banking.service.service.BankingTransactionService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class BankingTransactionServiceImpl  implements BankingTransactionService{
	 @Autowired
	    private BankingAccountDao accdao;

	    @Autowired
	    private BankingTransactionDao  transdao;
	
	@Override
	public FintechBankingTransaction processTransaction(FintechBankingTransaction request) {

		
	    TransactionType type = request.getTransactionType();

	    if (type == null) {
	        throw new RuntimeException("Transaction Type is required");
	    }

	    FinetechBankingAccount account =
	    		accdao.findByAccountNumber(request.getAccountNumber());

	    if (account == null) {
	        throw new RuntimeException("Account not found");
	    }

	    switch (type) {

	        case DEPOSIT:
	            account.setBalance(account.getBalance() + request.getAmount());
	            break;

	        case WITHDRAW:
	            if (account.getBalance() < request.getAmount()) {
	                throw new RuntimeException("Insufficient balance");
	            }
	            account.setBalance(account.getBalance() - request.getAmount());
	            break;

	    
	        case TRANSFER:

	            FinetechBankingAccount toAccount =
	                    accdao.findByAccountNumber(request.getToAccount());

	            if (toAccount == null) {
	                throw new RuntimeException("Receiver account not found");
	            }

	            if (account.getBalance() < request.getAmount()) {
	                throw new RuntimeException("Insufficient balance");
	            }

	            // Debit sender
	            account.setBalance(account.getBalance() - request.getAmount());

	            // Credit receiver
	            toAccount.setBalance(toAccount.getBalance() + request.getAmount());

	            accdao.update(toAccount);
	            break;
	           

	        default:
	            throw new RuntimeException("Invalid Transaction Type");
	    }

	    accdao.update(account);

	    // Save transaction
	    FintechBankingTransaction txn = new FintechBankingTransaction();
	    txn.setAccount(account); // ✅ correct object
	    txn.setAccountNumber(request.getAccountNumber());
	    txn.setToAccount(request.getToAccount());
	    txn.setTransactionType(type);
	    txn.setAmount(request.getAmount());
	    txn.setStatus(TransactionStatus.SUCCESS);
	    txn.setCreatedAt(LocalDate.now());
	    
	    return transdao.save(txn);
	
		
	}
	}
	
	
	


