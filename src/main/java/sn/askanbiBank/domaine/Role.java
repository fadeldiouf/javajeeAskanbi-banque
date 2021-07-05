package sn.askanbiBank.domaine;

public class Role {
	private int idrole;
	private String role;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int idrole, String role) {
		super();
		this.idrole = idrole;
		this.role = role;
	}
	public int getIdrole() {
		return idrole;
	}
	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
