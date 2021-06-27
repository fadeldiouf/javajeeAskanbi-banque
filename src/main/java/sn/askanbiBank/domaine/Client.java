package sn.askanbiBank.domaine;

public class Client {
	private Long idclient;
	private String nom;
	private String prenom;
	private String addresse;
	private String datenaiss;
	private String telephone;
	private String email;
	private String civilite;
	private String genre;
	private Long cni;
	
	public Client () {
		super();
	}
	public Client (Long idclient,String nom, String prenom,String addresse,String datenaiss,String telephone
			,String email,String civilite,String genre,Long cni) {
		super();
		this.idclient=idclient;
		this.nom=nom;
		this.prenom=prenom;
		this.addresse=addresse;
		this.datenaiss=datenaiss;
		this.telephone=telephone;
		this.email=email;
		this.civilite=civilite;
		this.genre=genre;
		this.cni=cni;
		
		
		
	}
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
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
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getDatenaiss() {
		return datenaiss;
	}
	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
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
	public Long getCni() {
		return cni;
	}
	public void setCni(Long cni) {
		this.cni = cni;
	}
	
	
	

}
