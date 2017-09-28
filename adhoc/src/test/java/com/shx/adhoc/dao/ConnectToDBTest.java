package com.shx.adhoc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConnectToDBTest {
	
	private Connection connect;
	private Statement stmt;
	private final String conAddress = "jdbc:mysql://localhost:3306/country";
	private final String username = "root";
	private final String psw = "root";
	private final String query = "select * from district";
	private int i;
	
	@Before
	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load succeed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		
		try {
			connect = DriverManager.getConnection(conAddress, username, psw);
			
			System.out.println("Success connect Mysql server!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectAllDistrict() {
		try {
			stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				i++;
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@After
	public void closeConnector() {
		try {
			System.out.println("There are totally " + i + " district");
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
