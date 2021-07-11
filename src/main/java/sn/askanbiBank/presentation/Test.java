package sn.askanbiBank.presentation;

import sn.askanbiBank.dao.IdaoAddAgentImpl;
import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;

public class Test {

	public static void main(String[] args) {
		IdaoAddAgentImpl dao = new IdaoAddAgentImpl();
		Agent agent;
		
		
		 agent = new Agent("nom","prenom","adresse","12022021","telephone","email","genre","civilite","cni");
		 User user = new User("username", "password"); 
		 dao.addAgent(agent, user);

	}

}
