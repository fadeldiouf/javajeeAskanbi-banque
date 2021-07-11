package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Agence;

public interface IdaoAgence extends Idao<Agence>{
	public List<Agence> listeClient(); 
	public List<Agence> listeAgent();
	public List<Agence> listeOperations();
	
	
		

}
