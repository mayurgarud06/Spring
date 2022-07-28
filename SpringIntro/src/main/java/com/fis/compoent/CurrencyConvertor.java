package com.fis.compoent;

import org.springframework.stereotype.Component;

@Component("currCon") //alternative to <bean id="currCon" class="com.fis.compoent"/>/
public class CurrencyConvertor {
	
	public double convert(String from ,String to,double amount) {
		if(from.equals("USD")&& to.equals("INR")) {
			return amount*79.78;
		}
		else if (from.equals("GBP")&& to.equals("INR")) {
			return amount*96.30;
		}
		else
			return 0;//rather we should have thrown Exception that convertion is not supported 
	}

}
