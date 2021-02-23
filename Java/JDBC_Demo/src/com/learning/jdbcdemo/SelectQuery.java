package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public void selectEmployees() {
		ConnectDb db = new ConnectDb();

		Connection con = db.connect();

		if(con!=null)
		{
		
		try (Statement st = con.createStatement()) { // Sentences which we want to be conveyed
													 // to dealer using translator

			//Declaring the query to be fired on database
			String query = "select * from employees"; // actual demand

				//Executing query with help of Statement object st
				//st has reference of Connection(line 37)
				//Connection object has reference of Database url			
			ResultSet rs = st.executeQuery(query); // on demanding we will get data
			// which we want to ship-transport medium
			while (rs.next()) {
				String empId = String.valueOf(rs.getInt("id")); // converting the price into INR
				String empName = rs.getString("name");
				String empAddr = rs.getString("addr");

				System.out.println("Employee id: " + empId + "\tEmployee Name: " + empName + "\tEmpAddr: " + empAddr);
			}
		} catch (SQLException e) {
			System.out.println("Error connecting database");
		}
		}
		else
		{
			System.out.println("Connection not established");
		}
	}

}
