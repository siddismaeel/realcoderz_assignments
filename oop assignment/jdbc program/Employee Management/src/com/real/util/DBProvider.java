package com.real.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProvider {
	private static Connection con;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3307/test?useSSL=false";
		String userName = "root";
		String password = "2116";

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, password);
	
		return con;
	}

	public static void closeConnection() throws SQLException {
		if (con != null)
			con.close();
	}

}
