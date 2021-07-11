package sn.askanbiBank.model;

import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agence;

public class AgenceModel {
	private Agence agence= new Agence();
	private List<Agence> agences = new ArrayList<Agence>();
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public List<Agence> getAgences() {
		return agences;
	}
	public void setAgences(List<Agence> agences) {
		this.agences = agences;
	}
	

}
