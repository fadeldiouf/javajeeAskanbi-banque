package sn.askanbiBank.utilis;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MysqlConn {

	 public static Connection getMySQLConnection()
	         throws ClassNotFoundException, SQLException {
	     // Remarque: Modifiez les paramètres de connexion en conséquence.
	     String hostName = "localhost";
	     String dbName = "db_produit";
	     String userName = "root";
	     String password = "";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	  
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	    
	     Class.forName("com.mysql.jdbc.Driver");
	  
	     // La structure de URL Connection pour MySQL:
	     // Exemple:
	     // jdbc:mysql://localhost:3306/simplehr
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	  
	     Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}
