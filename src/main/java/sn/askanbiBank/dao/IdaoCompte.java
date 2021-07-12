package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Compte;

public interface IdaoCompte  extends Idao<Compte>{
	public void active (Compte t);
	public Compte getById (int id);
	public Compte verification(Long num_compte);
	public Compte verification2(Long num_compte);
	public List<Compte> listeparagence(int idagence);
	

}
