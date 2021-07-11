package sn.askanbiBank.domaine;

import java.io.Serializable;
import java.util.Date;

public class Agence implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idagence;
	private  String nomagence;
	private String adresse;
	private Date datecreation;
	private String email;
	private String telephone;
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	public Agence(String nomagence, String adresse, Date datecreation, String email, String telephone) {
		super();
		this.nomagence = nomagence;
		this.adresse = adresse;
		this.datecreation = datecreation;
		this.email = email;
		this.telephone = telephone;
	}

	public Agence(int idagence, String nomagence, String adresse, Date datecreation, String email,
			String telephone) {
		super();
		this.idagence = idagence;
		this.nomagence = nomagence;
		this.adresse = adresse;
		this.datecreation = datecreation;
		this.email = email;
		this.telephone = telephone;
	}
	public int getIdagence() {
		return idagence;
	}
	public void setIdagence(int idagence) {
		this.idagence = idagence;
	}
	public String getNomagence() {
		return nomagence;
	}
	public void setNomagence(String nomagence) {
		this.nomagence = nomagence;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}
