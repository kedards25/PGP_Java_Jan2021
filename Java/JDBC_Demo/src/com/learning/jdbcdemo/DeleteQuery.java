package com.learning.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {

	int rows=0;
	public void deleteEmployee()
	{
		ConnectDb db = new ConnectDb();

		Connection con = db.connect();
		
		if(con!=null)
		{
			String query="delete employees "
					+ "where id=?";
			try {
				PreparedStatement pst=con.prepareStatement(query);
				
				pst.setInt(1,4);

				rows=pst.executeUpdate();

				if(rows>0)
				{
					System.out.println("Employee data deleted");
				}
				else
				{
					System.out.println("Employee data deletion failed");
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
