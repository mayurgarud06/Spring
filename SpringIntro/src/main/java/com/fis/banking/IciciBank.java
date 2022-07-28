package com.fis.banking;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {
	public void withdraw(int atmid,int acno,double amount) {
		System.out.println("ICici customer wants to withdraw");
	}

}
