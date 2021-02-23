package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {

	int rows=0;
	
	public void updateEmployee()
	{
		ConnectDb db = new ConnectDb();

		Connection con = db.connect();
		
		if(con!=null)
		{
			String query="update employees "
					+ "set name=? "
					+ "where id=?";
			try {
				PreparedStatement pst=con.prepareStatement(query);
				
				pst.setString(1, "Sapna Agarwal");
				pst.setInt(2,4);

				rows=pst.executeUpdate();

				if(rows>0)
				{
					System.out.println("Employee data updated");
				}
				else
				{
					System.out.println("Employee data updation failed");
				}
			}
			catch (SQLException e) {
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Unable to connect");
		}
		}
	
}
