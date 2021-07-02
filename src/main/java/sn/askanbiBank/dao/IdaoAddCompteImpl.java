package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    Long idrole=1L;
    int len=10;
    
    
    public static String getMatricule(int n) 
    {
        //choisissez un caractére au hasard à partir de cette chaîne
        String str = "0123456789"; 
  
        StringBuilder s = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index = (int)(str.length() * Math.random()); 
            s.append(str.charAt(index)); 
        } 
        return s.toString(); 
    } 

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
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addClient(Client t, Compte c,User u) {
		// TODO Auto-generated method stub
		
		String sql1= "INSERT INTO client(nom,prenom,adresse,datenaissance,telephone,email,civilite,genre,cni) VALUES (?,?,?,?,?,?,?,?,?)" ;
		String sql2="INSERT INTO compte (idclient,num_compte,solde,datecreation,type_compte) VALUES (?,?,?,?,?)";
		String sql3="INSERT INTO user (idrole,idclient,username,password) VALUES (?,?,?,?)";
	      try {
	    	  con.setAutoCommit(false);
	     pst = con.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
	     pst.setString(1, t.getNom());
	     pst.setString(2,t.getPrenom());
	     pst.setString(3,t.getAdresse());
	     pst.setString(4, t.getDatenaissance());
	     pst.setString(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.setString(7, t.getCivilite());
	     pst.setString(8, t.getGenre());
	     pst.setString(9, t.getCni());
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

}
