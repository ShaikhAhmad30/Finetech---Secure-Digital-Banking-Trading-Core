package com.finetech.banking.service.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.finetech.banking.service.dao.BankingUserDao;
import com.finetech.banking.service.entity.FinetechBankingUser;
import com.finetech.banking.service.repo.BankingUserRepo;
@Repository
public class BankingUserDaoImp implements BankingUserDao{
@Autowired 
BankingUserRepo repo;
	@Override
	public FinetechBankingUser registerUser(FinetechBankingUser user) {
		try {
            // Check duplicate email
            if (repo.existsByEmail(user.getEmail())) {
                throw new RuntimeException("Email already registered");
            }

            // Save user
            return repo.save(user);

        } catch (Exception e) {
            e.printStackTrace();
		
	}
		return user;
		
	}

	@Override
	public FinetechBankingUser getUserById(long id) {
		 try {
	            Optional<FinetechBankingUser> user = repo.findById(id);
	            return user.orElse(null);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return null;
	}

	@Override
	public FinetechBankingUser getUserByEmail(String email) {
		 try {
	            Optional<FinetechBankingUser> user = repo.findByEmail(email);
	            return user.orElse(null);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return null;
	}

	@Override
	public boolean authenticate(String email, String password) {
		try {
            Optional<FinetechBankingUser> user = repo.findByEmail(email);

            if (user.isPresent()) {
                // Simple password check 
                return user.get().getPassword().equals(password);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		return false;
	}

}
