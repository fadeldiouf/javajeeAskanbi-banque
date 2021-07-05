package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Compte;

public interface IdaoCompte  extends Idao<Compte>{
	public Boolean active (Compte t);
	

}
