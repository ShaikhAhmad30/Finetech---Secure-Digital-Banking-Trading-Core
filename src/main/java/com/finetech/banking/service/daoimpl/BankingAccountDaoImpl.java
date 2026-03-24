package com.finetech.banking.service.daoimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finetech.banking.service.dao.BankingAccountDao;
import com.finetech.banking.service.entity.FinetechBankingAccount;
import com.finetech.banking.service.entity.FinetechBankingUser;
import com.finetech.banking.service.repo.BankingAccountRepo;
import com.finetech.banking.service.repo.BankingUserRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
@Repository
public class BankingAccountDaoImpl implements BankingAccountDao {
    //account repository Autowired for save account
  @Autowired  
   private BankingAccountRepo accrepo;

//user repository autowired for checking user is existiong or not
  @Autowired 
   private BankingUserRepo userrepo;

@Autowired EntityManager entityManager;
	@Override
	public FinetechBankingAccount createAccount(long a_id, FinetechBankingAccount account){
		 {

		        //  Check if user exists
		        FinetechBankingUser user = userrepo.findById(a_id)
		                .orElseThrow(() -> new RuntimeException("User not found"));
		        
		        
		        account.setBankUser(user);

		        //generate account number
		        account.setAccountNumber("ACC" + System.currentTimeMillis());

		        // Save account in DB
		        return accrepo.save(account);
		    }
	        
	}

	@Override
	public FinetechBankingAccount getAccountById(Long accountId) {
		 return accrepo.findById(accountId)
	                .orElseThrow(() -> new RuntimeException("Account not found"));
		
	}

	@Override
	public List<FinetechBankingAccount> getAccountsByUserId(Long userId) {
		 return null;	
	}

	@Override
	public FinetechBankingAccount findByAccountNumber(String accountNumber) {
		  try {
	            TypedQuery<FinetechBankingAccount> query =
	                    entityManager.createQuery(
	                        "SELECT a FROM FinetechBankingAccount a WHERE a.accountNumber = :accNo",
	                        FinetechBankingAccount.class
	                    );

	            query.setParameter("accNo", accountNumber);

	            return query.getSingleResult();

	        } catch (NoResultException e) {
	            throw new RuntimeException("Account not found with number: " + accountNumber);
	        }
	}

	@Override
	public FinetechBankingAccount update(FinetechBankingAccount account) {
		 return entityManager.merge(account);
	}

}
