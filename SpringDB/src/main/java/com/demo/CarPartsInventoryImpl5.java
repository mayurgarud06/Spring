package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("carPartsInv5")
public class CarPartsInventoryImpl5 implements CarPartsInventory {

		@PersistenceContext
		private EntityManager entityManager;
		
		@Transactional
	public void addNewPart(CarPart carPart) {

		entityManager.persist(carPart);
	}

	public List<CarPart> getAvaliableParts() {

		List<CarPart> list = entityManager.createQuery("select c from CarPart c").getResultList();
		return list;
	}

}
