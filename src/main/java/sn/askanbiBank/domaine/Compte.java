package sn.askanbiBank.domaine;

import java.io.Serializable;

public class  Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  Long idcompte;
	private Client client;
	private Long num_compte;
	private Double solde;
	private Boolean active;
	private String typecompte;
	
	public Compte() {
		super();
	}
	public Compte(Long idcompte,Client client,Long num_compte,Double solde,Boolean active,
			String typecompte){
		super();
		this.idcompte=idcompte;
		this.client=client;
		this.num_compte=num_compte;
		this.solde=solde;
		this.active=active;
		this.typecompte=typecompte;
		
	}
	public Long getIdcompte() {
		return idcompte;
		
	}
	public void setIdcompte(Long idcompte) {
		this.idcompte=idcompte;
		
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client=client;
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
	public String getTypecompte() {
		return typecompte;
		
	}
	public void setTypecompte(String Typecompte) {
		this.typecompte=Typecompte;
		
	}

}
