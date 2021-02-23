package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuery {

	int rows=0;
	public void insertEmployee()
	{
		ConnectDb db = new ConnectDb();

		Connection con = db.connect();
		
		if(con!=null)
		{
			
			//'?' represents placeholder to be replaced by actual values 
			//at runtime
			String query="insert into employees values(?,?,?,?)";
			try {
				
				con.setAutoCommit(false);
				PreparedStatement pst=con.prepareStatement(query);
				
				pst.setInt(1, 4);
				pst.setString(2, "Vileparle");
				pst.setString(3, "4568799213");
				pst.setString(4, "Sapna");
				
				rows=pst.executeUpdate();
				con.commit();
				
				if(rows>0)
				{
					System.out.println("Employee data entry done");
				}
				else
				{
					System.out.println("Employee data entry failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		else
		{
			System.out.println("Unable to connect");
		}

	}
}
