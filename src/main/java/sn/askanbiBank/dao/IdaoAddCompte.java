package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;

public interface IdaoAddCompte extends Idao<Client> {
	public void addClient (Client t,Compte c,User u);

}
