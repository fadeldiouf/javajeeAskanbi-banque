package sn.askanbiBank.utilis;
import java.sql.*;

public class Connexion {
	private static  String Driver="com.mysql.jdbc.Driver";
	private static String url ="jdbc:mysql://localhost:3306/askanbibanquedb";
	private static String login="root";
	private static String password="";
	private static  Connection con;
	
	
	public static Connection connexionDB() {
		try {
			Class.forName(Driver);
			System.out.println("chemin de la base trouvé");
			con=DriverManager.getConnection(url,login,password);
			System.out.println("connection a la base de données reusi");
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return con;
	
	
		
	}

}
