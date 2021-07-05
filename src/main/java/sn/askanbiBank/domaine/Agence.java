package sn.askanbiBank.domaine;

import java.io.Serializable;

public class Agence implements Serializable {
	private int idagence;
	private  String nomagence;
	private String adresse;
	private String datenaissance;
	private String email;
	private String telephone;
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Agence(int idagence, String nomagence, String adresse, String datenaissance, String email,
			String telephone) {
		super();
		this.idagence = idagence;
		this.nomagence = nomagence;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
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
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
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
