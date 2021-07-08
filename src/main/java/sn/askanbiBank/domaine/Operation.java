package sn.askanbiBank.domaine;

import java.sql.Date;

public class Operation {
	private int idoperation;
	private Agent agent= new Agent();
	private TypeOperation typeoperation= new TypeOperation();
	private Compte compte = new Compte();
	private Date dateoperation;
	private Double debit;
	private Double debite;
	private Double envoie;
	private Double recue;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(Agent agent, TypeOperation typeoperation, Compte compte, Date dateoperation, Double debit,
			Double debite, Double envoie, Double recue) {
		super();
		this.agent = agent;
		this.typeoperation = typeoperation;
		this.compte = compte;
		this.dateoperation = dateoperation;
		this.debit = debit;
		this.debite = debite;
		this.envoie = envoie;
		this.recue = recue;
	}
	public int getIdoperation() {
		return idoperation;
	}
	public void setIdoperation(int idoperation) {
		this.idoperation = idoperation;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public TypeOperation getTypeoperation() {
		return typeoperation;
	}
	public void setTypeoperation(TypeOperation typeoperation) {
		this.typeoperation = typeoperation;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Date getDateoperation() {
		return dateoperation;
	}
	public void setDateoperation(Date dateoperation) {
		this.dateoperation = dateoperation;
	}
	public Double getDebit() {
		return debit;
	}
	public void setDebit(Double debit) {
		this.debit = debit;
	}
	public Double getDebite() {
		return debite;
	}
	public void setDebite(Double debite) {
		this.debite = debite;
	}
	public Double getEnvoie() {
		return envoie;
	}
	public void setEnvoie(Double envoie) {
		this.envoie = envoie;
	}
	public Double getRecue() {
		return recue;
	}
	public void setRecue(Double recue) {
		this.recue = recue;
	}
	
	

}
