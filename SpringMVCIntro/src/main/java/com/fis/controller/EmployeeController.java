package com.fis.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fis.dao.EmployeeDao;
import com.fis.entity.Employee;

@Controller
public class EmployeeController {
     
	@Autowired
	private EmployeeDao empDao;
	@RequestMapping("/add-emp")
	public String add(Employee emp) {
		empDao.add(emp);
		return "confirmation.jsp";
	}

//	
//	@RequestMapping("/add-emp")
//	public String add(HttpServletRequest request) {
//
//		Employee emp = new Employee();
//		emp.setName(request.getParameter("name"));
//		emp.setSalary(Double.parseDouble(request.getParameter("salary")));
//		emp.setDateOfJoining(LocalDate.parse(request.getParameter("doj")));
//
//		empDao.add(emp);
//		return "confirmation.jsp";
//	}

}
