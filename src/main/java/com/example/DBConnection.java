package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		connection.createStatement().execute("create table jbdl(name varchar(50),id int)");
		connection.close();
	}

}
