package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IdaoClientImpl implements IdaoClient{

     Connection con= SingletonConnection.getConnection();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
		String sql= "INSERT INTO client(nom,prenom,adresse,datenaissance,telephone,email,civilite,genre,cni) VALUES (?,?,?,?,?,?,?,?,?)" ;
	      try {
	     pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
	     pst.setString(1, t.getNom());
	     pst.setString(2,t.getPrenom());
	     pst.setString(3,t.getAdresse());
	     pst.setString(4, t.getDatenaissance());
	     pst.setString(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.setString(7, t.getCivilite());
	     pst.setString(8, t.getGenre());
	     pst.setString(9, t.getCni());
	     pst.executeUpdate();
	     rs=pst.getGeneratedKeys();
	     if ( rs.next() ) {
	     t.setIdclient(rs.getInt(1));
	     } else {
	     throw  new RuntimeException( "Échec de la création du client en base, aucun ID auto-généré retourné." );
	     }
	     pst.close();
	     
	      }catch (SQLException e) {
				e.printStackTrace();
	      }
	}

	@Override 
	public List<Client> liste() {
		// TODO Auto-generated method stub
		List<Client> liste = new ArrayList<Client>();
		String sql="SELECT * FROM client";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
			Client c = new Client();
			c.setIdclient(rs.getInt("idclient"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setAdresse(rs.getString("adresse"));
			c.setDatenaissance(rs.getString("datenaissance"));
			c.setTelephone(rs.getString("telephone"));
			c.setEmail(rs.getString("email"));
			c.setCivilite(rs.getString("civilite"));
			c.setGenre(rs.getString("genre"));
			c.setCni(rs.getString("cni")); 
			liste.add(c);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return liste;
	}

	@Override
	public void update(Client t) {
		// TODO Auto-generated method stub 
		String sql="UPDATE client SET nom=?,prenom=?,adresse=?,datenaissance=?,telephone=?,email=?,civilite=?,genre=?,cni=? where idclient=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, t.getNom());
			pst.setString(2, t.getPrenom());
			pst.setString(3, t.getAdresse());
			pst.setString(4, t.getDatenaissance());
			pst.setString(5, t.getTelephone());
			pst.setString(6, t.getEmail());
			pst.setString(7, t.getCivilite());
			pst.setString(8, t.getGenre());
			pst.setString(9, t.getCni());
			pst.setInt(10, t.getIdclient());
			pst.executeUpdate();
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void delete(int id) {
		String sql="DELETE FROM client WHERE idclient=?";
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
	public Client getByID(int id) {
		Client t =  null;
		String sql= "SELECT * FROM client t,compte c,user u WHERE t.idclient=c.idclient AND t.idclient=u.idclient and t.idclient=? ";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if (rs.next()) {
				t =  new Client();
				t.setIdclient(rs.getInt("idclient"));
				t.setNom(rs.getString("nom"));
				t.setPrenom(rs.getString("prenom"));
				t.setAdresse(rs.getString("adresse"));
				t.setDatenaissance(rs.getString("datenaissance"));
				t.setTelephone(rs.getString("telephone"));
				t.setEmail(rs.getString("email"));
				t.setCivilite(rs.getString("civilite"));
				t.setGenre(rs.getString("genre"));
				t.setCni(rs.getString("cni"));	
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(t==null) throw new RuntimeException("client non trouvable");
		return t  ;
	}

	

	
}
