package com.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.postgresql.Driver;

public class delete {
	public static String url="jdbc:postgresql://localhost:5432/m3_jdbc?user=postgres&password=root";
	public static void main(String[] args) {
		Driver driver=new Driver();
		try {
			DriverManager.registerDriver(driver);
		    Connection con=DriverManager.getConnection(url);
		    String sql="delete from customer where customer_id=?";
		    PreparedStatement pr=con.prepareStatement(sql);
		    
			pr.setInt(1,1);
			pr.execute();
			System.out.println("Data Deleted .......");
			pr.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}
}
