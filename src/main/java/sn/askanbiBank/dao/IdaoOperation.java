package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;

public interface IdaoOperation {
	public void saveOperationDpt(Operation o, Compte c, Long num_credite);
	public void saveOperationRet(Operation o,Compte c,Long num_debite );
	public void saveOperationVrmt(Operation o1,Operation o2,Compte c1, Compte c2 , Long num_envoie,Long num_recue );
	public List<Operation> listopagent(int idagent);
}
