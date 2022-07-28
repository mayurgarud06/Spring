package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("carPartsInv4")
public class CarPartsInventoryImpl4 implements CarPartsInventory {
	@Autowired
	//private DataSource dataSource;
	private JdbcTemplate jt;

	public void addNewPart(CarPart carPart) {

		jt.update("insert into tbl_carpart values(?, ?,?,?, ?)", carPart.getPartNo(), carPart.getPartName(),
				carPart.getCarModel(), carPart.getPrice(), carPart.getQuantity());
	}

	public List<CarPart> getAvaliableParts() {

		List<CarPart> list = jt.query("select * from tbl_carpart", BeanPropertyRowMapper.newInstance(CarPart.class));
		return list;
	}

}
