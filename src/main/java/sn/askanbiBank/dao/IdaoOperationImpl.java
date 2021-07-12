package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoOperationImpl implements IdaoOperation {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst,pst2,pst3,pst4;
    Statement stmt;
    ResultSet rs;


	@Override
	public void saveOperationDpt(Operation o,Compte c, Long num_credite) {
		// TODO Auto-generated method stub
		
		int idtype=1;
		String sql1="UPDATE compte SET solde=? WHERE num_compte=?";
		String sql2="INSERT INTO operation (idagent,idtype,idcompte,dateoperation,credit)  VALUES(?,?,?,?,?)";
		try {
			con.setAutoCommit(false); 
			pst=con.prepareStatement(sql1);
			pst.setDouble(1,c.getSolde() );
			pst.setLong(2, c.getNum_compte());
			pst.executeUpdate();
			pst.close(); 
			
			pst2=con.prepareStatement(sql2);
			pst2.setInt(1, o.getAgent().getIdagent());
			pst2.setInt(2, idtype);
			pst2.setInt(3, o.getCompte().getIdcompte());
			pst2.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			pst2.setDouble(5, o.getCredit());
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
		
		
		
	}

	@Override
	public void saveOperationRet(Operation o,Compte c,Long num_debite) {
		// TODO Auto-generated method stub
		int idtype=2;
		String sql1="UPDATE compte SET solde=? WHERE num_compte=?";
		String sql2="INSERT INTO operation (idagent,idtype,idcompte,dateoperation,debite)  VALUES(?,?,?,?,?)";
		try {
			con.setAutoCommit(false); 
			pst=con.prepareStatement(sql1);
			pst.setDouble(1,c.getSolde() );
			pst.setLong(2, c.getNum_compte());
			pst.executeUpdate();
			pst.close(); 
			
			pst2=con.prepareStatement(sql2);
			pst2.setInt(1, o.getAgent().getIdagent());
			pst2.setInt(2, idtype);
			pst2.setInt(3, o.getCompte().getIdcompte());
			pst2.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			pst2.setDouble(5, o.getDebite());
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
		
	}

	@Override
	public void saveOperationVrmt(Operation o1,Operation o2,Compte c1, Compte c2 , Long num_envoie,Long num_recue) {
		// TODO Auto-generated method stub
		int idtype=3;
		String sql1="UPDATE compte SET solde=? WHERE num_compte=?";
		String sql2="INSERT INTO operation (idagent,idtype,idcompte,dateoperation,envoie)  VALUES(?,?,?,?,?)";
		String sql3="UPDATE compte SET solde=? WHERE num_compte=?";
		String sql4="INSERT INTO operation (idagent,idtype,idcompte,dateoperation,recue)  VALUES(?,?,?,?,?)";
		try {
			con.setAutoCommit(false); 
			pst=con.prepareStatement(sql1);
			pst.setDouble(1,c1.getSolde() );
			pst.setLong(2, c1.getNum_compte());
			pst.executeUpdate();
			pst.close(); 
			
			pst2=con.prepareStatement(sql2);
			pst2.setInt(1, o1.getAgent().getIdagent());
			pst2.setInt(2, idtype);
			pst2.setInt(3, o1.getCompte().getIdcompte());
			pst2.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			pst2.setDouble(5, o1.getEnvoie());
			pst2.executeUpdate();
			pst2.close();
			pst3=con.prepareStatement(sql3);
			pst3.setDouble(1,c2.getSolde() );
			pst3.setLong(2, c2.getNum_compte());
			pst3.executeUpdate();
			pst3.close(); 
			
			pst2=con.prepareStatement(sql4);
			pst2.setInt(1, o2.getAgent().getIdagent());
			pst2.setInt(2, idtype);
			pst2.setInt(3, o2.getCompte().getIdcompte());
			pst2.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			pst2.setDouble(5, o2.getRecue());
			pst2.executeUpdate();
			pst2.close();
			
			con.commit();
		  System.out.println("operation faite avec success");
		  {
			 con.rollback(); 
		  }
			
		} catch (Exception e) {
		
	}
	}

	@Override
	public List<Operation> listopagent(int idagent) {
		List<Operation> listopagent= new ArrayList<>();
		String sql="SELECT idoperation,o.idcompte,num_compte,dateoperation,credit,debite,envoie,recue,t.typeoperation from operation o,  compte c ,type t where o.idtype=t.idtype and o.idcompte=c.idcompte and  idagent=? order by dateoperation desc";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, idagent);
			rs=pst.executeQuery();
			while(rs.next()) {
				Operation o =new Operation();
			o.setIdoperation(rs.getInt("idoperation"));
			o.getCompte().setIdcompte(rs.getInt("idcompte"));
			o.getCompte().setNum_compte(rs.getLong("num_compte"));
			o.setDateoperation(rs.getDate("dateoperation"));
			o.setCredit(rs.getDouble("credit"));
			o.setDebite(rs.getDouble("debite"));
			o.setEnvoie(rs.getDouble("envoie"));
			o.setRecue(rs.getDouble("recue"));
			o.getTypeoperation().setTypeoperation(rs.getString("typeoperation"));
			listopagent.add(o);
			}
			
			pst.close(); 
		} catch (Exception e) {
			
		}
		return listopagent;
	}

	@Override
	public List<Operation> listopagence(int idagence) {
		List<Operation> listopagence= new ArrayList<>();
		String sql="SELECT a.idagent,idoperation,o.idcompte,num_compte,dateoperation,credit,debite,envoie,recue,t.typeoperation from agent a, operation o,\r\n"
				+ "         compte c,type t where o.idtype=t.idtype\r\n"
				+ "         and a.idagent=o.idagent and o.idcompte=c.idcompte and  idagence=? order by dateoperation desc";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, idagence);
			rs=pst.executeQuery();
			while(rs.next()) {
		    Operation o =new Operation();
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
			listopagence.add(o);
			}
			
			pst.close(); 
		} catch (Exception e) {
			
		}
		return listopagence;	}	

}
