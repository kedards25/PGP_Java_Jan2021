package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) {
		
//		SelectQuery select=new SelectQuery();
//		select.selectEmployees();
		
//		InsertQuery insert=new InsertQuery();
//		insert.insertEmployee();
		
//		UpdateQuery update=new UpdateQuery();
//		update.updateEmployee();
		
//=============================================		
//		String url="jdbc:h2:tcp://localhost/~/hiberdb2";	//flight						
//		String user="sa";									//ticket						
//		String password="";	//passport
//		
//		//checked exception
////		try {
////			Class.forName("org.h2.Driver");
////		} catch (ClassNotFoundException e1) {
////			System.out.println("Driver class not found");
////		}
//		
//		Driver d=new org.h2.Driver();
//		try {
//			DriverManager.registerDriver(d);
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		//establishing connection using object of Connection Interface
//		//with the help of method getConnection of DriverManager class
//		try (Connection conn=DriverManager.getConnection(url, user, password);	//we are traveling
//																				//to Dubai and hiring a translator
//				//creating Statement object on connection object conn
//				//using CreateStatement method
//				Statement st=conn.createStatement()){							//Sentences which we want to be conveyed 
//																				//to dealer using translator
//			
//			//Declaring the query to be fired on database
//			String query="select * from employees";								//actual demand
//			
//			//Executing query with help of Statement object st
//			//st has reference of Connection(line 37)
//			//Connection object has reference of Database url			
//			ResultSet rs= st.executeQuery(query);								//on demanding we will get data
//																				//which we want to ship-transport medium
//			while(rs.next())		
//			{
//				String empId=String.valueOf(rs.getInt("id"));					//converting the price into INR
//				String empName=rs.getString("name");
//				String empAddr=rs.getString("addr");
//				
//				System.out.println("Employee id: "+empId+"\tEmployee Name: "+empName+"\tEmpAddr: "+empAddr);
//			}
//		} catch (SQLException e) {
//			System.out.println("Error connecting database");
//		}

	}

}
