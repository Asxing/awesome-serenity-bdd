package com.holddie.bdd.action;

import com.holddie.bdd.domain.AccountType;
import net.thucydides.core.annotations.Step;

public class CreateAccountAction {
	String customerName;
	AccountType accountType;

	public CreateAccountAction forCustomer(String customerName) {
		this.customerName = customerName;
		return this;
	}

	public CreateAccountAction ofType(AccountType accountType) {
		this.accountType = accountType;
		return this;
	}

	@Step("Create a #accountType account for customer #customerName with a balance of ${0}")
	public int withABalanceOf(int balance) {
		return balance;
	}
}
