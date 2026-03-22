package com.finetech.banking.service.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TransactionType {
	 DEPOSIT,
	 WITHDRAW,
	 TRANSFER;
	 
	 @JsonCreator
	    public static TransactionType from(String value) {
	        return TransactionType.valueOf(value.toUpperCase());
	    }
}
