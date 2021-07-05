package sn.askanbiBank.domaine;

import java.io.Serializable;

public class User  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long iduser;
	private Role role = new Role();
	private Client client = new Client();
	private Agent agent= new Agent();
	private String username ;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long iduser, Long idrole, Client client, String username, String password) {
		super();
		this.iduser = iduser;
		this.client = client;
		this.username = username;
		this.password = password;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Long getIduser() {
		return iduser;
	}
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
