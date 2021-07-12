package sn.askanbiBank.dao;


import java.util.List;

import jdk.internal.agent.resources.agent;
import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.domaine.User;

public class Test {

	public static void main(String[] args) {
//		IdaoClient metier  = new IdaoClientImpl();
	   IdaoUser user= new IdaoUserImpl();
//      ?
//		
//	      
		
		IdaoOperation metier= new IdaoOperationImpl();
		IdaoAgence agence = new IdaoAgenceImpl();
		IdaoAddAgent agent= new IdaoAddAgentImpl();
		

//        System.out.println("=======================");
//        Agent c= agent.getByID(1);
//        User u= user.getByID(1);
//        
//        c.getAgence().setIdagence(2);
//        agence.designeradmin(c,u);
		// TODO Auto-generated method stub
//          List<Operation> test= metier.listopagent(1); 
//          for(Operation c: test) {
//        	System.out.println(c.getIdoperation());
//        	System.out.println( c.getCompte().getIdcompte());
//        	System.out.println(c.getCompte().getNum_compte());
//        	System.out.println(c.getDateoperation());
//        	System.out.println(c.getCredit());
//        	System.out.println(c.getDebite());
//        	System.out.println(c.getEnvoie());
//        	System.out.println(c.getRecue());
//        	System.out.println(c.getTypeoperation().getTypeoperation());
//        	
//        	
//        	
//
////        }
		List<Agence> test=agence.sansadmin();
		for(Agence a:test) {
			System.out.println(a.getIdagence());	
		}
//		List<Operation> test2=metier.listopagence(1);
//		for(Operation a:test2) {
//			System.out.println(a.getIdoperation());
//			System.out.println(a.getAgent().getIdagent());
//			
//		}
//		List<User> test3=agence.listeAgent();
//		for(User a:test3) {
//			System.out.println(a.getAgent().getIdagent());
//			System.out.println(a.getAgent().getNom());
//			System.out.println(a.getAgent().getCni());
//			System.out.println(a.getUsername());
//		}
//		IdaoAddAgent metier= new IdaoAddAgentImpl();
//		// TODO Auto-generated method stub
//        List<User> test= metier.listUser(1); 
//        for(User c: test) {
//        	System.out.println(c.getAgent().getIdagent());
//        	System.out.println(c.getAgent().getNom());
//        	System.out.println(c.getAgent().getPrenom());
//        	System.out.println(c.getAgent().getAdresse());
//        	System.out.println(c.getAgent().getTelephone());
//        	System.out.println(c.getAgent().getGenre());
//        	System.out.println(c.getAgent().getCivilite());
//        	System.out.println(c.getAgent().getCni());
//        	System.out.println(c.getUsername());
//        	System.out.println(c.getPassword());
//        	
//        	
//        	
//        	
//
//        }

	}
	

//        System.out.println("=======================");
//        Compte c = metier.getByID(86);
//        System.out.println(c.getClient().getNom());
//    	System.out.println( c.getClient().getPrenom());
//    	System.out.println(c.getSolde());
//    	System.out.println(c.getType_compte());
//    	System.out.println(c.getActive());
//    	System.out.println(c.getUser().getUsername());
//    	System.out.println(c.getUser().getIduser());
    	
//    	System.out.println("=======================");
//        User u = user.authentification("Maps@diongue", "passer");
//        System.out.println(u.getUsername());
//    	System.out.println(u.getPassword());
//    	System.out.println(u.getRole().getRole());
//    	System.out.println(u.getAgent().getAgence().getIdagence());
//    	System.out.println(u.getAgent().getAgence().getNomagence());
//    	System.out.println(u.getAgent().getIdagent());
//    	System.out.println(u.getAgent().getNom());
//    	System.out.println(u.getAgent().getPrenom());
//    	System.out.println("=======================");
//    	String a= user1.verification("fadel@diouf", "passer");
//    	System.out.println();
    	
//    	System.out.println("=======================");
//        Compte c = metier.verification(5620638247l);
//    	System.out.println(c.getClient().getNom());
//    	System.out.println(c.getClient().getPrenom());
//    	System.out.println(c.getSolde());
//    	System.out.println(c.getNum_compte());
//    	System.out.println(c.getIdcompte());
    	
    	
}
//        Client c2=metier.getByID(79);
//        System.out.println(c2.getIdclient());
//        System.out.println(c2.getNom());
//        System.out.println(c2.getPrenom());
//        System.out.println(c2.getDatenaissance());
        
//        metier.delete(62L);
//        
        
        



