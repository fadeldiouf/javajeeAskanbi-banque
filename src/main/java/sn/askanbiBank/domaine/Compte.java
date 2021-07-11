package sn.askanbiBank.domaine;

import java.io.Serializable;
import java.util.Date;

public class  Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int idcompte;
	private Client client = new Client();
	private User user = new User();
	private Agent agent = new Agent();
	private Long num_compte;
	private double solde;
	private Date datecreation;
	private Boolean active;
	private String type_compte;
	
	public Compte() {
		super();
		
	}
	public Compte(int idcompte, Client client, Long num_compte, double solde, Date datecreation, Boolean active,
			String type_compte) {
		super();
		this.idcompte = idcompte;
		this.client = client;
		this.num_compte = num_compte;
		this.solde = solde;
		this.datecreation = datecreation;
		this.active = active;
		this.type_compte = type_compte;
	}
	public Compte(double solde,String type_compte){
		super();
		this.solde=solde;
		this.type_compte=type_compte;
		
	}
	public int getIdcompte() {
		return idcompte;
		
	}
	public void setIdcompte(int idcompte) {
		this.idcompte=idcompte;
		
	}
	
	public Long getNum_compte() {
		return num_compte;
		
	}
	public void setNum_compte(Long num_compte) {
		this.num_compte=num_compte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
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
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
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
	public static void main(String[] args) {
		//3338308954
	} 

}
