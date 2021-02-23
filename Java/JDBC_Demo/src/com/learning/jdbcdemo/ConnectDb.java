package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
	
	String url="jdbc:h2:tcp://localhost/~/hiberdb2";							
	String user="sa";															
	String password="";	
	
	public Connection connect()
	{
		Connection conn=null;
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Driver class not found");
		}
		
		try
		{
			conn=DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		return conn;
	}

}
