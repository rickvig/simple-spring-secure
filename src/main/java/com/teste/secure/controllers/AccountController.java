package com.teste.secure.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping(value = "svc/v1/public/accounts/{accountNumber}")
	public String getAccountPublic(@PathVariable final int accountNumber) {
		return "Public Account " + accountNumber;
	}
	
	@RequestMapping(value = "svc/v1/private/accounts/{accountNumber}")
	public String getAccountPrivate(@PathVariable final int accountNumber) {
		return "Privete Account " + accountNumber;
	}
}
