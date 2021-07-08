package sn.askanbiBank.dao;

import sn.askanbiBank.domaine.Operation;

public interface IdaoOperation {
	public void saveOperationDpt(Operation o,String num_credite,Double montant);
	public void saveOperationRet(Operation o,String num_debite,Double montant );
	public void saveOperationVrmt(Operation o,String num_envoie,String num_recue,Double montant );

}
