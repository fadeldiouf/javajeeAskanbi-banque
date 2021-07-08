package sn.askanbiBank.domaine;

public class TypeOperation {
	private int idtype;
	private String typeoperation;
	public TypeOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeOperation(int idtype, String typeoperation) {
		super();
		this.idtype = idtype;
		this.typeoperation = typeoperation;
	}
	public int getIdtype() {
		return idtype;
	}
	public void setIdtype(int idtype) {
		this.idtype = idtype;
	}
	public String getTypeoperation() {
		return typeoperation;
	}
	public void setTypeoperation(String typeoperation) {
		this.typeoperation = typeoperation;
	}
	

}
