package sn.askanbiBank.model;

import java.util.ArrayList;
import java.util.List;

import sn.askanbiBank.domaine.Operation;

public class OperationModel {
	private List<Operation> operations = new ArrayList<>();

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	

}
