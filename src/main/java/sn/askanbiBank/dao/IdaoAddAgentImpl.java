package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoAddAgentImpl implements IdaoAddAgent {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst,pst2,pst3;
    Statement stmt;
    ResultSet rs;
    Long idrole=2L;
    int len=10;
    
    
	@Override
	public void save(Agent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agent> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Agent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agent getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAgent(Agent t,User u) {
		// TODO Auto-generated method stub
		
		String sql1= "INSERT INTO agent(idagence,nom,prenom,adresse,datenaissance,telephone,email,genre,civilite,cni) VALUES (?,?,?,?,?,?,?,?,?,?)" ;
		String sql2="INSERT INTO user (idrole,idagent,username,password) VALUES (?,?,?,?)";
	      try {
	    	  con.setAutoCommit(false);
	     pst = con.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
//	     pst.setInt(1, t.getAgence().getIdagence());
	     pst.setInt(1, t.getAgence().getIdagence());
	     pst.setString(2, t.getNom());
	     pst.setString(3,t.getPrenom());
	     pst.setString(4,t.getAdresse());
	     pst.setString(5, t.getDatenaissance());
	     pst.setString(6, t.getTelephone());
	     pst.setString(7, t.getEmail());
	     pst.setString(8, t.getGenre());
	     pst.setString(9, t.getCivilite());
	     pst.setString(10, t.getCni());
	     Long idReturn=(long) pst.executeUpdate();
	     rs=pst.getGeneratedKeys();
	     Long idAgent=0L;
		 if ( rs.next() ) {
		     idAgent=rs.getLong(1);
		     if(idReturn==1) {
		    	 pst2=con.prepareStatement(sql2);
			     pst2.setLong(1, idrole);
			     pst2.setLong(2, idAgent);
			     pst2.setString(3, u.getUsername());
			     pst2.setString(4, u.getPassword());
			     pst2.executeUpdate();
		     }
		     con.commit();
		     System.out.println("inersion faite avec success");
		 } else {
			 con.rollback(); 
		 }
	     
	      }catch (SQLException e) {				
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public List<User> listUser(int idagence) {
		List<User> listUser = new ArrayList<>();
		String sql="SELECT * FROM agent,user    WHERE  user.idagent=agent.idagent and  idagence=? group by agent.idagent desc";
			try {
				pst=con.prepareStatement(sql);
				pst.setInt(1, idagence);
				rs=pst.executeQuery();
				while(rs.next()) {
				User c= new User();
				c.getAgent().setIdagent(rs.getInt("idagent"));
				c.getAgent().setNom(rs.getString("nom"));
				c.getAgent().setPrenom(rs.getString("prenom"));
				c.getAgent().setAdresse(rs.getString("adresse"));
				c.getAgent().setDatenaissance(rs.getString("datenaissance"));
				c.getAgent().setTelephone(rs.getString("telephone"));
				c.getAgent().setEmail(rs.getString("email"));
				c.getAgent().setGenre(rs.getString("genre"));
				c.getAgent().setCivilite(rs.getString("civilite"));
				c.getAgent().setCni(rs.getString("cni"));
				c.setUsername(rs.getString("username"));
				c.setPassword(rs.getString("password"));
				listUser.add(c);
				}
				pst.close(); 
		} catch (Exception e) {
			
		}
		return listUser;
	
	}
	
}

