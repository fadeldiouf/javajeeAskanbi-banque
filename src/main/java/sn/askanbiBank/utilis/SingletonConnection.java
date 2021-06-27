package sn.askanbiBank.utilis;

import java.sql.*;

import com.mysql.jdbc.Connection;

public class SingletonConnection {

	private static Connection connection;
	
	static {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/askanbibanquedb","root","");
			 System.out.println("connection reussi");
		} catch (Exception e) {
			System.out.println("connection refuser");
			e.printStackTrace();
		}
		
	}
	
	
	public static Connection getConnection() {
		return connection;
	}
}
