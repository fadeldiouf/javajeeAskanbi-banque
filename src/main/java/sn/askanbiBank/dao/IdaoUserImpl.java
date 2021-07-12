package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoUserImpl  implements IdaoUser {
	
	 Connection con= SingletonConnection.getConnection();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
     
     
     public  String verification (String username, String password) {	   
   String sql= "SELECT g.idagence as id_agence, g.nomagence as agence,a.nom,a.prenom,u.idagent as ID,username,password,role FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole AND username = ? AND password = ?";   	
         PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			 pst.setString(1, username);
	         pst.setString(2, password);
	         ResultSet rs = pst.executeQuery();
	         while (rs.next()) {
	        	 String userName = rs.getString("username"); //fetch the values present in database
	        	 String passWord = rs.getString("password");
	              String role= rs.getString("role");
					  if(username.equals(userName) && password.equals(passWord))
					  { return
					  role; }
	         }
	            }
	              catch(SQLException e)
	              {
	                 e.printStackTrace();
	              }
	              return null;// Return appropriate message in case of failure
	          }
     @Override
 	public User authentification(String username, String password) {
 		// TODO Auto-generated method stub
    	  User u= null;
    	   String sql= "SELECT g.idagence as id_agence, g.nomagence as agence,a.nom,a.prenom,u.idagent as ID,username,password,role FROM agence g, agent a,user u, role r WHERE g.idagence = a.idagence ANd a.idagent = u.idagent AND u.idrole = r.idrole AND username = ? AND password = ?";   	
    	     try {
    	    	 
				pst = con.prepareStatement(sql);
				 pst.setString(1, username);
		         pst.setString(2, password);
		         ResultSet rs = pst.executeQuery();
		         while (rs.next()){
		        	 u = new User();
		        	u.setUsername(rs.getString("username"));
		        	u.setPassword(rs.getString("password"));
		        	u.getRole().setRole(rs.getString("role"));
		        	u.getAgent().getAgence().setIdagence(rs.getInt("id_agence"));
		        	u.getAgent().setIdagent(rs.getInt("ID"));
		        	u.getAgent().getAgence().setNomagence(rs.getString("agence"));
		        	u.getAgent().setNom(rs.getString("nom"));
		        	u.getAgent().setPrenom(rs.getString("prenom"));
		        	 	 
		         }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
 		return u;
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
		User t =  null;
		String sql= "SELECT * FROM user WHERE idagent=? ";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if (rs.next()) {
				t =  new User();
				t.getRole().setIdrole(rs.getInt("idrole"));
				t.getAgent().setIdagent(rs.getInt("idagent"));
				t.setUsername(rs.getString("Username"));
				t.setPassword(rs.getString("password"));	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(t==null) throw new RuntimeException("agent non trouvable");
		return t  ;
		
	}


	
	

}
