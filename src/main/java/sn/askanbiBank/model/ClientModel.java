package sn.askanbiBank.model;

import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;

public class ClientModel {
	private Client client = new Client();
	private User user = new User();
	private Compte compte = new Compte();
	private List<Client> clients = new ArrayList<Client>();

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
