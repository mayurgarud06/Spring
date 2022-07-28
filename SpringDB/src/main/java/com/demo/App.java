package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
	CarPartsInventory cpInv = (CarPartsInventory) ctx.getBean("carPartsInv5");
	
	CarPart cp = new CarPart();
	 cp.setPartNo(110);
	 cp.setPartName("seat cover");
	 cp.setCarModel("MG hector");
	 cp.setPrice(2000);
	 cp.setQuantity(20);
	 long ms1= System.currentTimeMillis();
	 cpInv.addNewPart(cp);
	 
	List <CarPart> list =cpInv.getAvaliableParts();
	long ms2= System.currentTimeMillis();
	System.out.println("tootal time "+(ms2-ms1)+" ms");
	for(CarPart cp1 :list) {
		System.out.println(cp1);
	}
	 
	 
}
}
