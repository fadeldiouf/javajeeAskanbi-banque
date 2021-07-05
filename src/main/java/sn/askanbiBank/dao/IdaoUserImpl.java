package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoUserImpl  implements IdaoUser {
	
	 Connection con= SingletonConnection.getConnection();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
     
    // public ArrayList<User> authentification(String username, String password) {
    	
    	// ArrayList <User> liste=new ArrayList<User>();
    	  // String sql= " SELECT g.idagence as id_agence, g.nomagence as agence,a.nom,a.prenom,u.idagent as ID,"
    	   	//	+ "username,password,role" +
    			//    "FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole"+
    			//     "AND username = ? AND password = ?";
    	   
    	   //String userNameDB = "";
           //String passwordDB = "";
     
     public ArrayList<Object> authentification(String username, String password) {
    	  // String sql= " SELECT * from user where  username = ? AND password = ?";
    	   
    	   
   String sql= "SELECT g.idagence as id_agence, g.nomagence as agence,a.nom,a.prenom,u.idagent as ID,username,password,role FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole AND username = ? AND password = ?";   	
   ArrayList<Object> liste1=new ArrayList<>();
         PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			 pst.setString(1, username);
	         pst.setString(2, password);
	         ResultSet rs = pst.executeQuery();
	         
	         //HttpSession session= request.getSession();
	         
	         //if rs.next()
	         while (rs.next()) {
	        	 String userName = rs.getString("username"); //fetch the values present in database
	        	 String passWord = rs.getString("password");
	              String role= rs.getString("role");
	              String nomagence=rs.getString("nomagence");
	              int idagence= rs.getInt("id_agence");
	              int idagent= rs.getInt("ID");
	              String nom= rs.getNString("nom");
	              String prenom=rs.getString("prenom");
	              liste1.add(userName);
	              liste1.add(passWord);
	              liste1.add(role);
	              liste1.add(nomagence);
	              liste1.add(idagence);
	              liste1.add(idagent);
	              liste1.add(nom);
	              liste1.add(prenom);
	              
					/*
					 * if(username.equals(userNameDB) && password.equals(passwordDB)) { return
					 * liste; }
					 */
	              
	         }
	            }
	              catch(SQLException e)
	              {
	                 e.printStackTrace();
	              }
	              return liste1;// Return appropriate message in case of failure
	          }
	  

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
		

	@Override
	public User getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
