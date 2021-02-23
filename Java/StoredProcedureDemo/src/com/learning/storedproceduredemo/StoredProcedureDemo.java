package com.learning.storedproceduredemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedureDemo {

	String url="jdbc:sqlserver://localhost:1433;databaseName=mydatabase";
	String user="sa";
	String password="sasa";
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	int rows;
	
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
	
	public void createProcedure()
	{
		if(isConnected())
		{
			try
			{
				String procedureStatement="create Procedure myProcedure "
											+ "as "
											+ "select * "
											+ "from students";
				
				st=con.createStatement();
				
				rows=st.executeUpdate(procedureStatement);
				
				if(rows>0)
				{
					System.out.println("Procedure created successfully");
				}
				else
				{
					System.out.println("Procedure either exists or creation failed");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	public void execProcedure()
	{
		if(isConnected())
		{
			try
			{
				String execProc="exec myProcedure";
				CallableStatement cst=con.prepareCall(execProc);
				rs=cst.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt("stdId");
					String name = rs.getString(2);
					String mail = rs.getString("EmailId");
					String addr = rs.getString("addr");
					System.out.println(id + "\t" + name + "\t" + mail + "" + "\t" + addr);
				}
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		
		StoredProcedureDemo demo=new StoredProcedureDemo();
		demo.createProcedure();
		demo.execProcedure();

	}

}
