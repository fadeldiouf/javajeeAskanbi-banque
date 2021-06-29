package sn.askanbiBank.dao;

import java.util.List;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;

public class Test {

	public static void main(String[] args) {
//		IdaoClient metier  = new IdaoClientImpl();
		IdaoAddCompte metier= new IdaoAddCompteImpl();
	metier.addClient(new Client("diouf", "mbaye", "colobane", "12-05-1990", "776777777", "faloud.com", "celibataire",
			"masculin","1642"), new Compte( 50000D, "courant"), new User("fadji@fadel", "passer"));
//	
//		// TODO Auto-generated method stub
//        List<Client> clients= metier.liste();
//        for(Client c: clients) {
//        	System.out.println(c.getNom());
//        	
//        }
//        System.out.println("=======================");
////        Client c= metier.getByID(64L);
////        c.setNom("fayef");
////        c.setPrenom("mbaye");
////        metier.update(c);
//        Client c2=metier.getByID(79L);
//        Compte c = new Compte();
//        System.out.println(c2.getIdclient());
//        System.out.println(c2.getNom());
//        System.out.println(c2.getPrenom());
//        System.out.println(c.getSolde());
        
//        metier.delete(62L);
//        
        
        
	}


}
