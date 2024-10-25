package com.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Update {
	public static String url="jdbc:postgresql://localhost:5432/m3_jdbc?user=postgres&password=root";
	public static void main(String[] args) {
		Driver driver=new Driver();
		try {
			DriverManager.registerDriver(driver);
		    Connection con=DriverManager.getConnection(url);
		    String sql="update customer set customer_name =?,customer_mobile=?,customer_email=?,customer_age=?  where customer_id=?";
		    PreparedStatement pr=con.prepareStatement(sql);
		    
		    pr.setString(1,"Omkar");
			pr.setLong(2,9099057545l);
			pr.setString(3,"omkar@gmail.com");
			pr.setInt(4,17);
			pr.setInt(5,2);
			pr.execute();
			System.out.println("Data Updated .......");
			pr.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
