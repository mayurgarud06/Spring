package com.fis.compoent;

import org.springframework.stereotype.Component;

@Component("remote")
public class Remote {
	public void PressOn () {
		System.out.println("press On...Starting... Tv");
	}
	public void PressOff () {
		System.out.println("Press off...shutdown Tv");
	}

}
