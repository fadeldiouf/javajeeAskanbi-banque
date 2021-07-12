package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoAgenceImpl implements IdaoAgence {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst,pst2;
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
		return liste;	
	}

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
	public List<Compte> listeClient() {
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
	public List<User> listeAgent() {
		// TODO Auto-generated method stub
		List<User> listUser = new ArrayList<>();
		String sql="SELECT * FROM agent,user    WHERE  user.idagent=agent.idagent  group by agent.idagent desc";
			try {
				pst=con.prepareStatement(sql);
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
				c.getRole().setIdrole(rs.getInt("idrole"));
				listUser.add(c);
				}
				pst.close(); 
		} catch (Exception e) {
			
		}
		return listUser;
	}

	@Override
	public List<Operation> listeOperations() {
		List<Operation> liste = new ArrayList<>();
		String sql="SELECT g.idagence, a.idagent, idoperation,o.idcompte,num_compte,dateoperation,credit,debite,envoie,recue,t.typeoperation from agence g, agent a, operation o,\r\n"
				+ "     compte c ,type t where o.idtype=t.idtype\r\n"
				+ "     and g.idagence=a.idagence and a.idagent=o.idagent and o.idcompte=c.idcompte order by dateoperation desc";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				Operation o =new Operation();
			o.getAgent().getAgence().setIdagence(rs.getInt("idagence"));
			o.getAgent().setIdagent(rs.getInt("idagent"));
			o.setIdoperation(rs.getInt("idoperation"));
			o.getCompte().setIdcompte(rs.getInt("idcompte"));
			o.getCompte().setNum_compte(rs.getLong("num_compte"));
			o.setDateoperation(rs.getDate("dateoperation"));
			o.setCredit(rs.getDouble("credit"));
			o.setDebite(rs.getDouble("debite"));
			o.setEnvoie(rs.getDouble("envoie"));
			o.setRecue(rs.getDouble("recue"));
			o.getTypeoperation().setTypeoperation(rs.getString("typeoperation"));
			liste.add(o);
			}
			
			pst.close(); 
		} catch (Exception e) {
			
		}
		return liste;
	}



	@Override
	public void designeradmin(Agent t,User u) {
		int idrole=2;
		String sql1=" UPDATE agent SET idagence=? where idagent=? ";
		String sql2= "UPDATE user SET idrole=? where idagent=?";
		try {
			con.setAutoCommit(false); 
			pst=con.prepareStatement(sql1);
			pst.setInt(1,t.getAgence().getIdagence());
			pst.setInt(2, t.getIdagent());
			pst.executeUpdate();
			pst.close(); 
			
			pst2=con.prepareStatement(sql2);
			pst2.setInt(1, idrole);
			pst2.setInt(2, u.getAgent().getIdagent());
			pst2.executeUpdate();
			pst2.close(); 
			con.commit();
		  System.out.println("operation faite avec success");
		  {
			 con.rollback(); 
		  }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agence> sansadmin() {
		
		List<Agence> liste = new ArrayList<Agence>();
		String sql = "SELECT* from agence where idagence not in"
				+ "(select idagence from agent where idagent in(select idagent from user where idrole=2))";
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
		return liste;
	}

}
