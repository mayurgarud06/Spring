package com.fis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


import com.fis.entity.Employee;

//Data Access Object
//classes which have Database code called as Dao
@Component
public class EmployeeDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Employee emp1) {
		entityManager.persist(emp1);
	}
	public List <Employee>  getEmpDetails(){
		List<Employee> list = entityManager.createQuery("select c from Employee c").getResultList();
		return list;
		
	}
	public List <Employee>  getSalary(double salary){
		List<Employee> list1 = entityManager.createQuery("select c from Employee c where c.salary >=:sal").setParameter("sal",salary).getResultList();
		return list1;
		
	}

}
