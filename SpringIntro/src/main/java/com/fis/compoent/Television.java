package com.fis.compoent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mytv")
public class Television {
	@Autowired Remote rm;
	public void watchMovie() {
		rm.PressOn();
		System.out.println("Watching movie");
		rm.PressOff();
		
	}

}
