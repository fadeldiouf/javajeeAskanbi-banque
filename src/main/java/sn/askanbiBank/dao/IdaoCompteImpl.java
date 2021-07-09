package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoCompteImpl  implements IdaoCompte{
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	Date date = new Date();
	 Connection con= SingletonConnection.getConnection();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
     

	@Override
	public void save(Compte t) {
		
	}

	@Override
	public List<Compte> liste() {
		List<Compte> liste = new ArrayList<Compte>();
		String sql="SELECT l.idclient,nom,prenom,adresse,datenaissance,telephone,email,civilite,genre,cni,c.idcompte,num_compte,solde,datecreation,type_compte,active FROM client l,compte c WHERE l.idclient=c.idclient and  l.idagent IN (SELECT idagent FROM agent WHERE idagence=1)";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
			Compte c= new Compte();
			c.getClient().setIdclient(rs.getInt("idclient"));
			c.getClient().setNom(rs.getString("nom"));
			c.getClient().setPrenom(rs.getString("prenom"));
			c.getClient().setAdresse(rs.getString("adresse"));
			c.getClient().setDatenaissance(rs.getString("datenaissance"));
			c.getClient().setTelephone(rs.getString("telephone"));
			c.getClient().setEmail(rs.getString("email"));
			c.getClient().setCivilite(rs.getString("civilite"));
			c.getClient().setGenre(rs.getString("genre"));
			c.getClient().setCni(rs.getString("cni"));
			c.setIdcompte(rs.getInt("idcompte"));
			c.setNum_compte(rs.getLong("num_compte"));
			c.setSolde(rs.getLong("solde"));
			c.setDatecreation(rs.getDate("datecreation"));
			c.setType_compte(rs.getString("type_compte"));
			c.setActive(rs.getBoolean("active"));
			liste.add(c);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return liste;
	}

	@Override
	public void update(Compte t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean active(Compte t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte getByID(int id) {
		Compte c =  null;
		String sql= "SELECT * FROM client t,compte c,user u WHERE t.idclient=c.idclient AND t.idclient=u.idclient and t.idclient=? ";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			if (rs.next()) {
				c =  new Compte();
				c.getClient().setIdclient(rs.getInt("idclient"));
				c.getClient().setNom(rs.getString("nom"));
				c.getClient().setPrenom(rs.getString("prenom"));
				c.getClient().setAdresse(rs.getString("adresse"));
				c.getClient().setDatenaissance(rs.getString("datenaissance"));
				c.getClient().setTelephone(rs.getString("telephone"));
				c.getClient().setEmail(rs.getString("email"));
				c.getClient().setCivilite(rs.getString("civilite"));
				c.getClient().setGenre(rs.getString("genre"));
				c.getClient().setCni(rs.getString("cni"));
				c.setIdcompte(rs.getInt("idcompte"));
				c.setNum_compte(rs.getLong("num_compte"));
				c.setSolde(rs.getLong("solde"));
				c.setDatecreation(rs.getDate("datecreation"));
				c.setType_compte(rs.getString("type_compte"));
				c.setActive(rs.getBoolean("active"));
				c.getUser().setIduser(rs.getLong("iduser"));
				c.getUser().setUsername(rs.getString("username"));
				c.getUser().setPassword(rs.getString("password"));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(c==null) throw new RuntimeException("client non trouvable");
		return c;
	}

	@Override
	public Compte verification(Long num_compte) {
		Compte cpt=null;
		String sql="SELECT nom,prenom, idcompte,num_compte,solde FROM client c, compte o WHERE c.idclient=o.idclient  AND num_compte=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setLong(1, num_compte);
			rs= pst.executeQuery();
			while(rs.next()) {
				cpt= new Compte();
				cpt.setNum_compte(rs.getLong("num_compte"));
				cpt.getClient().setNom(rs.getString("nom"));
				cpt.getClient().setPrenom(rs.getString("prenom"));
				cpt.setSolde(rs.getDouble("solde"));
				cpt.setIdcompte(rs.getInt("idcompte"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return cpt;
	}

	@Override
	public Compte verification2(Long num_compte) {
		// TODO Auto-generated method stub
		Compte cpt=null;
		String sql="SELECT nom,prenom, idcompte,num_compte,solde FROM client c, compte o WHERE c.idclient=o.idclient  AND num_compte=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setLong(1, num_compte);
			rs= pst.executeQuery();
			while(rs.next()) {
				cpt= new Compte();
				cpt.setNum_compte(rs.getLong("num_compte"));
				cpt.getClient().setNom(rs.getString("nom"));
				cpt.getClient().setPrenom(rs.getString("prenom"));
				cpt.setSolde(rs.getDouble("solde"));
				cpt.setIdcompte(rs.getInt("idcompte"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return cpt;
	}

	@Override
	public List<Compte> listeparagence(int idagence) {
		// TODO Auto-generated method stub
		List<Compte> listeparagence = new ArrayList<Compte>();
		String sql="SELECT l.idclient,nom,prenom,adresse,datenaissance,telephone,email,civilite,genre,cni,c.idcompte,num_compte,solde,datecreation,type_compte,active FROM client l,compte c WHERE l.idclient=c.idclient and  l.idagent IN (SELECT idagent FROM agent WHERE idagence=?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, idagence);
			rs=pst.executeQuery();
			while(rs.next()) {
			Compte c= new Compte();
			c.getClient().setIdclient(rs.getInt("idclient"));
			c.getClient().setNom(rs.getString("nom"));
			c.getClient().setPrenom(rs.getString("prenom"));
			c.getClient().setAdresse(rs.getString("adresse"));
			c.getClient().setDatenaissance(rs.getString("datenaissance"));
			c.getClient().setTelephone(rs.getString("telephone"));
			c.getClient().setEmail(rs.getString("email"));
			c.getClient().setCivilite(rs.getString("civilite"));
			c.getClient().setGenre(rs.getString("genre"));
			c.getClient().setCni(rs.getString("cni"));
			c.setIdcompte(rs.getInt("idcompte"));
			c.setNum_compte(rs.getLong("num_compte"));
			c.setSolde(rs.getLong("solde"));
			c.setDatecreation(rs.getDate("datecreation"));
			c.setType_compte(rs.getString("type_compte"));
			c.setActive(rs.getBoolean("active"));
			listeparagence.add(c);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return listeparagence;
	}

}
