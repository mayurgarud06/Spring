package com.fis.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class SbiAtm implements Atm {

	@Autowired
	private Bank bank;

	public void withdraw(int acno, double amount) {
		System.out.println("Customer at SBIAtm want to withdraw money");
		bank.withdraw(12434, acno, amount);
	}

}
