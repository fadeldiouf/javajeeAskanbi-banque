package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Compte;

public interface IdaoCompte  extends Idao<Compte>{
	public Boolean active (Compte t);
	public Compte verification(Long num_compte);
	public Compte verification2(Long num_compte);
	public List<Compte> listeparagence(int idagence);
	

}
