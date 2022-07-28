package com.fis.compoent;

import org.springframework.stereotype.Component;

@Component("getper")
public class GetPercentage {
	
		public double  getPercentage(double marks ,double total) {
			return (marks/total)*100;
		}
	

}
