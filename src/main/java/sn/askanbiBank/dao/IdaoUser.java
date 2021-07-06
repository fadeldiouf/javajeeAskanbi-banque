package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.User;

public interface IdaoUser extends Idao<User>{
	public User authentification(String username,String password);
	
	

}
