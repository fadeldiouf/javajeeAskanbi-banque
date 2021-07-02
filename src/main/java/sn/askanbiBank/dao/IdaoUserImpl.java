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
     
     public String authentification(String username, String password) {
    	  // String sql= " SELECT * from user where  username = ? AND password = ?";
    	   
    	   
   String sql= "SELECT g.idagence as id_agence, g.nomagence as agence,a.nom,a.prenom,u.idagent as ID,username,password,role FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole AND username = ? AND password = ?";
    	    //	   		+ "username,password,role" +
    	    		//	   "FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole"+
    	    		//	    "AND username = ? AND password = ?";
    	 
    	   String userNameDB = "";
           String passwordDB = "";
         PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			 pst.setString(1, username);
	         pst.setString(2, password);
	         ResultSet rs = pst.executeQuery();
	         
	         //HttpSession session= request.getSession();
	         
	         //if rs.next()
	         while (rs.next()) {
	        	 

	              userNameDB = rs.getString("username"); //fetch the values present in database
	              passwordDB = rs.getString("password");
	              
	              if(username.equals(userNameDB) && password.equals(passwordDB))
	               {
	                  return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
	               }
	              
	         }
	        	 
	        	 //User l=new User();
	        	 
	        	 
	        	   // l.setIduser(rs.getLong("iduser"));
					//l.setIdrole(rs.getLong("idrole"));
					//l.setClient(rs.("Client"));
					//l.setUsername(rs.getString("username"));
					//l.setPassword(rs.getString("password"));
					//l.setNiveau(rs.getInt("niveau"));
					//liste.add(l);
					//result found, means valid inputs
	        	 //userNameDB = rs.getString("username"); //fetch the values present in database
	             // passwordDB = rs.getString("password");
	              
	              //if(username.equals(userNameDB) && password.equals(passwordDB))
	               //{
	                 // return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
	               //}
				
	         
	            }
	              catch(SQLException e)
	              {
	                 e.printStackTrace();
	              }
	              return "codes d'accés incorrects"; // Return appropriate message in case of failure
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
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
