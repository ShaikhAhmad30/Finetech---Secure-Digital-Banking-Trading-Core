package com.finetech.banking.service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finetech.banking.service.entity.FinetechBankingUser;

public interface BankingUserRepo extends JpaRepository<FinetechBankingUser, Long> {
	 Optional<FinetechBankingUser> findByEmail(String email);

	    boolean existsByEmail(String email);

	 
	    Optional<FinetechBankingUser> findByPanNumber(String panNumber);

	 
	    Optional<FinetechBankingUser> findByGovernmentId(String governmentId);

	  

	   
	    boolean existsByPanNumber(String panNumber);

	   
	    boolean existsByGovernmentId(String governmentId);

	   

}
