package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoAddCompteImpl implements IdaoAddCompte {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst,pst2,pst3;
    Statement stmt;
    ResultSet rs;
    Long idrole=4L;  
    int len=10;
    
    
	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addClient(Client t, Compte c,User u) {
		// TODO Auto-generated method stub
		
		String sql1= "INSERT INTO client(idagent,nom,prenom,adresse,datenaissance,telephone,email,civilite,genre,cni) VALUES (?,?,?,?,?,?,?,?,?,?)" ;
		String sql2="INSERT INTO compte (idclient,num_compte,solde,datecreation,type_compte) VALUES (?,?,?,?,?)";
		String sql3="INSERT INTO user (idrole,idclient,username,password) VALUES (?,?,?,?)";
	      try {
	    	  con.setAutoCommit(false);
	     pst = con.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
	     pst.setInt(1, t.getAgent().getIdagent());
	     pst.setString(2, t.getNom());
	     pst.setString(3,t.getPrenom());
	     pst.setString(4,t.getAdresse());
	     pst.setString(5, t.getDatenaissance());
	     pst.setString(6, t.getTelephone());
	     pst.setString(7, t.getEmail());
	     pst.setString(8, t.getCivilite());
	     pst.setString(9, t.getGenre());
	     pst.setString(10, t.getCni());
	     Long idReturn=(long) pst.executeUpdate();
	     rs=pst.getGeneratedKeys();
	     Long idClient=0L;
		 if ( rs.next() ) {
		     idClient=rs.getLong(1);
		     if(idReturn==1) {
		    	 pst2=con.prepareStatement(sql2);
			     pst2.setLong(1, idClient);
			     pst2.setString(2, c.getMatricule(len));
			     pst2.setDouble(3,c.getSolde() );
			     pst2.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			     pst2.setString(5, c.getType_compte());
			     pst2.executeUpdate();
			     
			     pst3=con.prepareStatement(sql3);
			     pst3.setLong(1, idrole);
			     pst3.setLong(2, idClient);
			     pst3.setString(3, u.getUsername());
			     pst3.setString(4, u.getPassword());
			     pst3.executeUpdate();
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
	public List<Object> listCompte(int idagence) {
		List<Object> listCompte = new ArrayList<>();
		String sql="SELECT * from client l,compte c,user u where l.idclient=c.idclient and l.idclient=u.idclient and\r\n"
				+ "     l.idagent IN (SELECT idagent FROM agent WHERE idagence=)";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, idagence);
			rs=pst.executeQuery();
			while(rs.next()) {
			Client c = new Client();
			Compte t= new Compte();
			User u = new User();
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
			t.setIdcompte(rs.getInt("idcompte"));
			t.setNum_compte(rs.getLong("num_compte"));
			t.setSolde(rs.getLong("solde"));
			t.setDatecreation(rs.getDate("datenaissance"));
			t.setType_compte(rs.getString("type_compte"));
			t.setActive(rs.getBoolean("active"));
			u.setIduser(rs.getLong("iduser"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			listCompte.add(c);
			listCompte.add(t);
			listCompte.add(u);
			}
			pst.close(); 
		} catch (Exception e) {
			
		}
		return listCompte;
	
	}

}
