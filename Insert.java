package com.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.postgresql.Driver;

public final class Insert {
	public static String url="jdbc:postgresql://localhost:5432/m3_jdbc?user=postgres&password=root";
	public static void main(String[] args) {
		
		Driver driver=new Driver();
		try {
			DriverManager.registerDriver(driver);
			Connection con=DriverManager.getConnection(url);
			String sql="insert into customer values(NEXTVAL('customer_id_seq'),?,?,?,?)";
			PreparedStatement  ps=con.prepareStatement(sql);
			ps.setString(1,"OM");
			ps.setLong(2,6723267271l);
			ps.setString(3,"om@gmail.com");
			ps.setInt(4,22);
			ps.execute();
			System.out.println("Data Saved Succesfully .....");
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
