package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.domaine.User;

public interface IdaoAgence extends Idao<Agence>{
	public List<Compte> listeClient(); 
	public List<User> listeAgent();
	public List<Operation> listeOperations();
	public List<Agence> sansadmin();
	public void designeradmin (Agent t,User u);
	
	
		

}
