package com.finetech.banking.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finetech.banking.service.dao.BankingUserDao;
import com.finetech.banking.service.entity.FinetechBankingUser;

@RestController
@RequestMapping("/users")

public class BankingUserController {
	@Autowired 
	BankingUserDao dao;
	
	
	//To register new  user in bank 
	@PostMapping("/registeruser")
	public FinetechBankingUser registerUser(@RequestBody FinetechBankingUser user) {
		return dao.registerUser(user);
		
	}
   @GetMapping("/{id}")
   public FinetechBankingUser getUserById(@PathVariable("id") long id) {
	   return dao.getUserById(id);
   }
   
   @GetMapping("/email/{email}")
   public FinetechBankingUser getUserByEmail(@PathVariable("email") String email) {
	return dao.getUserByEmail(email);
	   
   }
   @PostMapping("/login")
   public String login(@RequestParam("email") String email,@RequestParam("password") String password) {
	   boolean isValid = dao.authenticate(email, password);

       if (isValid) {
           return "Login Successful";
       } else {
           return "Invalid Email or Password";
       }
   }
}
