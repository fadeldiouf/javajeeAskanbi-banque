package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;

public interface IdaoAddAgent extends Idao<Agent> {
	public void addAgent (Agent t,User u);
	public  List<User> listUser(int idagence);
	

}
