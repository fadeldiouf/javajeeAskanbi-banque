package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;

public interface IdaoAgence extends Idao<Agence>{
	public List<Compte> listeClient(); 
	public List<Agent> listeAgent();
	public List<Operation> listeOperations();
	
	
		

}
