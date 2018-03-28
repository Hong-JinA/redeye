package com.hja.web;

import java.sql.DriverManager;

import org.junit.Test;

import com.mysql.jdbc.Connection;

public class MySQLConTest {
	String DRIVER = "com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://127.0.0.1:3306/bbs";
	String ID = "root";
	String PW = "wlsdksung57";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = (Connection) DriverManager.getConnection(URL, ID, PW)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
