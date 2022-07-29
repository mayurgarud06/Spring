package com.fis.app;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.dao.EmployeeDao;
import com.fis.entity.Employee;



public class App {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmployeeDao empDao =  ctx.getBean(EmployeeDao.class);
		
		 Employee emp= new Employee();
		// emp.setEmpno(101);
		 emp.setName("Raj");
		 emp.setSalary(20000);
		 emp.setDateOfJoining(LocalDate.of(2001, 6, 23));
		 
		 empDao.add(emp);
		 System.out.println("getting o/p");
		 //List<Employee> list =empDao.getEmpDetails();
		 List<Employee> list = empDao.getSalary(10000);
		 for(Employee ep :list) {
			 System.out.println(ep.getEmpno()+" "+ep.getName()+' '+ep.getSalary()+' '+ep.getDateOfJoining());
		 }
		

	}

}
