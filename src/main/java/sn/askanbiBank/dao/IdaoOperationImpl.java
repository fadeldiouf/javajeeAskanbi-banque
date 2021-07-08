package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.utilis.SingletonConnection;

public class IdaoOperationImpl implements IdaoOperation {
	Connection con= SingletonConnection.getConnection();
    PreparedStatement pst,pst2,pst3;
    Statement stmt;
    ResultSet rs;
    Double balance=0D;


	@Override
	public void saveOperationDpt(Operation o, String num_credite, Double montant) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void saveOperationRet(Operation o, String num_debite, Double montant) {
		// TODO Auto-generated method stub
		int idtye=2;
		String sql1="UPDATE compte SET solde=? WHERE num_compte=?";
		String sql2="INSERT INTO operation (idagent,idtype,idcompte,dateoperation,credit)  VALUES(?,?,?,?,?";
		
	}

	@Override
	public void saveOperationVrmt(Operation o, String num_envoie, String num_recue, Double montant) {
		// TODO Auto-generated method stub
		
	}

}
