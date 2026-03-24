package com.finetech.banking.service.entity;

import java.time.LocalDate;
import java.util.List;

import com.finetech.banking.service.enums.TransactionStatus;
import com.finetech.banking.service.enums.TransactionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="transactions")
public class FintechBankingTransaction {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long t_id;

	    @Enumerated(EnumType.STRING)
	    private TransactionType transactionType;

	    private Double amount;

	    private String accountNumber;
	    private String toAccount;

	    @Enumerated(EnumType.STRING)
	    private TransactionStatus status;

	    private LocalDate createdAt;

	    @ManyToOne
	    @JoinColumn(name = "account_id")
	    private FinetechBankingAccount account;

		public Long getT_id() {
			return t_id;
		}

		public void setT_id(Long t_id) {
			this.t_id = t_id;
		}

		

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

	
		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getToAccount() {
			return toAccount;
		}

		public void setToAccount(String toAccount) {
			this.toAccount = toAccount;
		}

		public TransactionStatus getStatus() {
			return status;
		}

		public void setStatus(TransactionStatus status) {
			this.status = status;
		}

		public LocalDate getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDate createdAt) {
			this.createdAt = createdAt;
		}

		public FinetechBankingAccount getAccount() {
			return account;
		}

		public void setAccount(FinetechBankingAccount account) {
			this.account = account;
		}

		public TransactionType getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(TransactionType transactionType) {
			this.transactionType = transactionType;
		}

		@Override
		public String toString() {
			return "FintechBankingTransaction [t_id=" + t_id + ", transactionType=" + transactionType + ", amount=" + amount
					+ ", accountNumber=" + accountNumber + ", toAccount=" + toAccount + ", status=" + status
					+ ", createdAt=" + createdAt + ", account=" + account + "]";
		}

		
	   
	}
	    

