package sn.askanbiBank.dao;


import java.util.List;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;

public class Test {

	public static void main(String[] args) {
//		IdaoClient metier  = new IdaoClientImpl();
//		IdaoUser lister= new IdaoUserImpl();
//		IdaoAddCompte metier= new IdaoAddCompteImpl();
		IdaoCompte metier = new IdaoCompteImpl();
//	metier.addClient(new Client("diouf", "mbaye", "colobane", "12-05-1990", "776777777", "faloud.com", "celibataire",
//			"masculin","1642"), new Compte( 50000d, "courant"), new User("fadji@fadel", "passer"));
////	
//		// TODO Auto-generated method stub
        List<Compte> test= metier.liste();
        for(Compte c: test) {
        	System.out.println(c.getClient().getNom());
        	System.out.println( c.getClient().getPrenom());
        	System.out.println(c.getSolde());
        	System.out.println(c.getType_compte());
        	System.out.println(c.getActive());
        	System.out.println(c.getActive());
        	
        	

        }
        System.out.println("=======================");
        Compte c = metier.getByID(86);
        System.out.println(c.getClient().getNom());
    	System.out.println( c.getClient().getPrenom());
    	System.out.println(c.getSolde());
    	System.out.println(c.getType_compte());
    	System.out.println(c.getActive());
    	System.out.println(c.getUser().getUsername());
    	System.out.println(c.getUser().getIduser());
	}
	}
//        System.out.println("=======================");
//        Client c= metier.getByID(83);
//        c.setNom("fayef");
//        c.setPrenom("mbaye");
//        c.setEmail("diouf@@@@@@@@@");
//        metier.update(c);
//        Client c2=metier.getByID(79);
//        System.out.println(c2.getIdclient());
//        System.out.println(c2.getNom());
//        System.out.println(c2.getPrenom());
//        System.out.println(c2.getDatenaissance());
        
//        metier.delete(62L);
//        
        
        



