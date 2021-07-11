package sn.askanbiBank.model;

import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;

public class AgentModel {
	private Agent agent = new Agent();
	private User user = new User();

	private List<User> users = new ArrayList<User>();




	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}
