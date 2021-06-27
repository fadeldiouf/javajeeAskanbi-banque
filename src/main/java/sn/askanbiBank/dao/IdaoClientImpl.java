package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Client;
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
		String sql= "INSERT INTO client VALUES (?,?,?,?,?,?,?,?,?)" ;
	      try {
	     pst = con.prepareStatement(sql);
	     pst.setString(1, t.getNom());
	     pst.setString(2,t.getPrenom());
	     pst.setString(3,t.getAddresse());
	     pst.setNString(4, t.getDatenaiss());
	     pst.setString(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.setString(7, t.getCivilite());
	     pst.setString(8, t.getGenre());
	     pst.setLong(9, t.getCni());
	     pst.executeUpdate();
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
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setAddresse(rs.getString("adresse"));
			c.setDatenaiss(rs.getString("datenaissance"));
			c.setTelephone(rs.getString("telephone"));
			c.setEmail(rs.getString("email"));
			c.setCivilite(rs.getString("civilite"));
			c.setGenre(rs.getString("genre"));
			c.setCni(rs.getLong("cni"));
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
	
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
