package sn.askanbiBank.domaine;

import java.io.Serializable;

public class Client  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idclient;
	private String nom;
	private String prenom;
	private String adresse;
	private String datenaissance;
	private String telephone;
	private String email;
	private String civilite;
	private String genre;
	private String cni;
	
	public Client () {
		super();
	}

	public Client(String nom, String prenom, String adresse, String datenaissance, String telephone,
			String email, String civilite, String genre, String cni) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
		this.telephone = telephone;
		this.email = email;
		this.civilite = civilite;
		this.genre = genre;
		this.cni = cni;
	}

	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}
	
		

}
