package com.real.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProvider {
	private static Connection con;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String userName = "system";
		String password = "system";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);
	
		return con;
	}

	public static void closeConnection() throws SQLException {
		if (con != null)
			con.close();
	}

}
