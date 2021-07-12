package sn.askanbiBank.model;

import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Operation;

public class OperationModel {
	private Agent agent= new Agent();
	private List<Operation> operations = new ArrayList<>();
	

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	

}
