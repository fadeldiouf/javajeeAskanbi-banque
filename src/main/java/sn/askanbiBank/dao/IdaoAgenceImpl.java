package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoAgenceImpl implements IdaoAgence {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst;
    Statement stmt;
    ResultSet rs;

	@Override
	public void save(Agence t) {
		// TODO Auto-generated method stub
		String sql= "INSERT INTO agence(nomagence,adresse,datecreation,telephone,email) VALUES (?,?,?,?,?)" ;
	      try {
	     pst = con.prepareStatement(sql);
	     pst.setString(1, t.getNomagence());
	     pst.setString(2,t.getAdresse());
	     pst.setDate(3,  new java.sql.Date(System.currentTimeMillis()));
	     pst.setString(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.executeUpdate();
	     pst.close();
	      }catch (SQLException e) {
				e.printStackTrace();
	      }
	}

		

	@Override
	public List<Agence> liste() {
		List<Agence> liste = new ArrayList<Agence>();
		String sql="SELECT * FROM agence";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				Agence a = new Agence();
			a.setIdagence(rs.getInt("idagence"));
			a.setNomagence(rs.getString("nomagence"));
			a.setAdresse(rs.getString("adresse"));
			a.setDatecreation(rs.getDate("datecreation"));
			a.setTelephone(rs.getString("telephone"));
			a.setEmail(rs.getString("email"));
			liste.add(a);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return liste;	}

	@Override
	public void update(Agence t) {
		String sql= "UPDATE  agence SET (nomagence=?,adresse=?,telephone=?,email=? where idagence=?)";
	      try {
	     pst = con.prepareStatement(sql);
	     pst.setString(1, t.getNomagence());
	     pst.setString(2,t.getAdresse());
	     pst.setString(3, t.getTelephone());
	     pst.setString(4, t.getEmail());
	     pst.setInt(5, t.getIdagence());
	     pst.executeUpdate();
	     pst.close();
	      }catch (SQLException e) {
				e.printStackTrace();
	      }
	}
		// TODO Auto-generated method stub
		

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agence getByID(int id) {
		Agence a =  null;
		String sql= "SELECT * FROM Agence ";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if (rs.next()) {
				a =  new Agence();
				a.setIdagence(rs.getInt("idagence"));
				a.setNomagence(rs.getString("nomagence"));
				a.setAdresse(rs.getString("adresse"));
				a.setDatecreation(rs.getDate("datenaissance"));
				a.setTelephone(rs.getString("telephone"));
				a.setEmail(rs.getString("email"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(a==null) throw new RuntimeException("agence non trouvable");
		return a  ;
	}

	@Override
	public List<Agence> listeClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agence> listeAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agence> listeOperations() {
		// TODO Auto-generated method stub
		return null;
	}

}
