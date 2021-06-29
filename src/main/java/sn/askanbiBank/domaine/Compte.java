package sn.askanbiBank.domaine;

import java.io.Serializable;
import java.util.Date;

public class  Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  Long idcompte;
	private Long idclient;
	private Long num_compte;
	private Double solde;
	private Date datecreation;
	private Boolean active;
	private String type_compte;
	
	public Compte() {
		super();
		
	}
	public Compte(Long idcompte, Long idclient, Long num_compte, Double solde, Date datecreation, Boolean active,
			String type_compte) {
		super();
		this.idcompte = idcompte;
		this.idclient = idclient;
		this.num_compte = num_compte;
		this.solde = solde;
		this.datecreation = datecreation;
		this.active = active;
		this.type_compte = type_compte;
	}
	public Compte(Double solde,String type_compte){
		super();
		this.solde=solde;
		this.type_compte=type_compte;
		
	}
	public Long getIdcompte() {
		return idcompte;
		
	}
	public void setIdcompte(Long idcompte) {
		this.idcompte=idcompte;
		
	}
	
	public Long getNum_compte() {
		return num_compte;
		
	}
	public void setNum_compte(Long num_compte) {
		this.num_compte=num_compte;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde=solde;
	}
	public Boolean getActive() {
		return active;
		
	}
	public void setActive(Boolean active) {
		this.active=active;
		
	}
	public String getType_compte() {
		return type_compte;
		
	}
	public void setType_compte(String Typecompte) {
		this.type_compte=Typecompte;
		
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	
	public String getMatricule(int n) 
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

}
