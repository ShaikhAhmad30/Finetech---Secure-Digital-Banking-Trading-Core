package com.finetech.banking.service.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class FinetechBankingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long a_id;

    @Column(unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private Double balance;

   
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private FinetechBankingUser bank_user;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    
    private List<FintechBankingTransaction> transactions;


   
   

	public Long getA_id() {
		return a_id;
	}

	public void setA_id(Long a_id) {
		this.a_id = a_id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}



	

	

	public FinetechBankingUser getBankUser() {
		return bank_user;
	}

	public void setBankUser(FinetechBankingUser bankUser) {
		this.bank_user = bankUser;
	}

	public List<FintechBankingTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<FintechBankingTransaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "FinetechBankingAccount [a_id=" + a_id + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", bank_user=" + bank_user + ", transactions=" + transactions + "]";
	}

	
	
	
}