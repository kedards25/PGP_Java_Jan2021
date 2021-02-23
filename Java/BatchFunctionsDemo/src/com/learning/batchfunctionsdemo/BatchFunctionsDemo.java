package com.learning.batchfunctionsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchFunctionsDemo {

	String url="jdbc:sqlserver://localhost:1433;databaseName=mydatabase";
	String user="sa";
	String password="sasa";
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	int[] rows;
	
	public boolean isConnected()
	{

		
		try {
			con=DriverManager.getConnection(url, user, password);
			
			if(con!=null)
			{
				return true;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return false;
	}
	
	void executeBatch()
	{
		if(isConnected())
		{
			try {
				con.setAutoCommit(false);
				st=con.createStatement();
				
				//batch is set of sql statements executed as single query
				st.addBatch("insert into students values(12,'Nikita','nikita@gmail.com','Goregaon')");
				st.addBatch("insert into students values(13,'Vani','vani@gmail.com','Andheri')");
				st.addBatch("insert into students values(14,'Rahul','rahul@gmail.com','Jogeshwari')");
				
				rows=st.executeBatch();
				if(rows.length>0)
				{
					con.commit();
					System.out.println("Batch executed successfully");
				}
				else
				{
					System.out.println("Batch execution failed");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		
		BatchFunctionsDemo demo=new BatchFunctionsDemo();
		demo.executeBatch();

	}

}
