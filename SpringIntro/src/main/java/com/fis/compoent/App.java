package com.fis.compoent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.banking.Atm;

public class App {
	public static void main(String[] args) {
		// creating IoC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		// accessing beans
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Mayur"));

		Calculator ad = (Calculator) ctx.getBean("add");
		System.out.println("addition is " + ad.add(10, 20));

		CurrencyConvertor cc = (CurrencyConvertor) ctx.getBean("currCon");
		System.out.println(cc.convert("USD", "INR", 100));

		GetPercentage gp = (GetPercentage) ctx.getBean("getper");
		System.out.println("Percentage is  " + gp.getPercentage(353, 500));

		TextEditor te = (TextEditor) ctx.getBean("TextEdtr");
		te.loadDocument("abc.txt");

		Television tv = (Television) ctx.getBean("mytv");
		tv.watchMovie();

		Atm atm = (Atm) ctx.getBean("sbiAtm");
		atm.withdraw(100001, 5000);
	}
}
