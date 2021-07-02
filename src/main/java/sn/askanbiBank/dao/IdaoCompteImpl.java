package sn.askanbiBank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import sn.askanbiBank.domaine.Compte;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Compte t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean active(Compte t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte getByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
