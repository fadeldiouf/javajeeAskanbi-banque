package sn.askanbiBank.domaine;

import java.io.Serializable;

public class Agent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idagent;
	private Agence agence = new Agence();
	private String nom;
	private String prenom;
	private String adresse;
	private String datenaissance;
	private String telephone;
	private String email;
	private String genre;
	private String civilite;
	private String cni;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Agent(String nom, String prenom, String adresse, String datenaissance, String telephone, String email,
			String genre, String civilite, String cni) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
		this.telephone = telephone;
		this.email = email;
		this.genre = genre;
		this.civilite = civilite;
		this.cni = cni;
	}


	public Agent(Agence agence, String nom, String prenom, String adresse, String datenaissance, String telephone,
			String email, String genre, String civilite, String cni) {
		super();
		this.agence = agence;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
		this.telephone = telephone;
		this.email = email;
		this.genre = genre;
		this.civilite = civilite;
		this.cni = cni;
	}

	public Agent(int idagent, String nom, String prenom, String adresse, String datenaissance, String telephone,
			String email, String genre, String civilite,  String cni) {
		super();
		this.idagent = idagent;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.datenaissance = datenaissance;
		this.telephone = telephone;
		this.email = email;
		this.genre = genre;
		this.civilite = civilite;
		this.cni = cni;
	}
	public int getIdagent() {
		return idagent;
	}
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public void setIdagent(int idagent) {
		this.idagent = idagent;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
