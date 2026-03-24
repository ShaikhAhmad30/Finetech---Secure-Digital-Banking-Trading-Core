package com.finetech.banking.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finetech.banking.service.entity.FinetechBankingAccount;
import com.finetech.banking.service.service.BankingAccountService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/accounts")
public class BankingAccountController {
@Autowired 
BankingAccountService service;

//creating account 
@PostMapping("/create/{userId}")
public FinetechBankingAccount createAccount(@PathVariable("userId") Long userId,@RequestBody FinetechBankingAccount account){
	return service.createAccount(userId, account);
}

    
    @GetMapping("/account/{accountId}")
    public FinetechBankingAccount getAccount(@PathVariable("accountId") Long accountId) {
        return service.getAccountById(accountId);
    }

   
    @GetMapping("/user/{userId}")
    public List<FinetechBankingAccount> getUserAccounts(@PathVariable("userId") Long userId) {
        return service.getAccountsByUserId(userId);
    }
}




