package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IdaoAgentImpl implements IdaoAgent{

     Connection con= SingletonConnection.getConnection();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
	@Override
	public void save(Agent t) {
		// TODO Auto-generated method stub
		String sql= "INSERT INTO agent(nom,prenom,adresse,datenaissance,telephone,email,genre,civilite,cni) VALUES (?,?,?,?,?,?,?,?,?)" ;
	      try {
	     pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
	     pst.setString(1, t.getNom());
	     pst.setString(2,t.getPrenom());
	     pst.setString(3,t.getAdresse());
	     pst.setString(4, t.getDatenaissance());
	     pst.setString(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.setString(8, t.getGenre());
	     pst.setString(7, t.getCivilite());
	     pst.setString(9, t.getCni());
	     pst.executeUpdate();
	     rs=pst.getGeneratedKeys();
	     if ( rs.next() ) {
	     t.setIdagent(rs.getInt(1));
	     } else {
	     throw  new RuntimeException( "Échec de la création du client en base, aucun ID auto-généré retourné." );
	     }
	     pst.close();
	     
	      }catch (SQLException e) {
				e.printStackTrace();
	      }
	}

	@Override 
	public List<Agent> liste() {
		// TODO Auto-generated method stub
		List<Agent> liste = new ArrayList<Agent>();
		String sql="SELECT * FROM agent";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
			Agent a = new Agent();
			a.setIdagent(rs.getInt("idagent"));
			a.setNom(rs.getString("nom"));
			a.setPrenom(rs.getString("prenom"));
			a.setAdresse(rs.getString("adresse"));
			a.setDatenaissance(rs.getString("datenaissance"));
			a.setTelephone(rs.getString("telephone"));
			a.setEmail(rs.getString("email"));
			a.setGenre(rs.getString("genre"));
			a.setCivilite(rs.getString("civilite"));
			a.setCni(rs.getString("cni")); 
			liste.add(a);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return liste;
	}

	@Override
	public void update(Agent t) {
		// TODO Auto-generated method stub 
		String sql="UPDATE agent SET nom=?,prenom=?,adresse=?,datenaissance=?,telephone=?,email=?,genre=?,civilite=?,cni=? where idagent=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, t.getNom());
			pst.setString(2, t.getPrenom());
			pst.setString(3, t.getAdresse());
			pst.setString(4, t.getDatenaissance());
			pst.setString(5, t.getTelephone());
			pst.setString(6, t.getEmail());
			pst.setString(8, t.getGenre());
			pst.setString(7, t.getCivilite());
			pst.setString(9, t.getCni());
			pst.setInt(10, t.getIdagent());
			pst.executeUpdate();
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void delete(int id) {
		String sql="DELETE FROM agent WHERE idagent=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setLong(1, id);
			pst.executeUpdate();
			pst.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agent getByID(int id) {
		Agent t =  null;
		String sql= "SELECT * FROM agent t,user u WHERE  t.idagent=u.idagent and t.idagent=? ";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if (rs.next()) {
				t =  new Agent();
				t.setIdagent(rs.getInt("idagent"));
				t.setNom(rs.getString("nom"));
				t.setPrenom(rs.getString("prenom"));
				t.setAdresse(rs.getString("adresse"));
				t.setDatenaissance(rs.getString("datenaissance"));
				t.setTelephone(rs.getString("telephone"));
				t.setEmail(rs.getString("email"));
				t.setGenre(rs.getString("genre"));
				t.setCivilite(rs.getString("civilite"));
				t.setCni(rs.getString("cni"));	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(t==null) throw new RuntimeException("agent non trouvable");
		return t  ;
	}

	@Override
	public Agent getIdAgent(int idAgent) {
		Agent agent=null;
		return agent;
	}

	

	
}
