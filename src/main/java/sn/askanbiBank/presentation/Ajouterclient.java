package sn.askanbiBank.presentation;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.askanbiBank.dao.IdaoAddCompte;
import sn.askanbiBank.dao.IdaoAddCompteImpl;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
@WebServlet("/ajouerClient")
public class Ajouterclient extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoAddCompte metier;
	
	public void init() throws ServletException{
		metier= new IdaoAddCompteImpl();
	}

	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String datenaissance =request.getParameter("datenaissance");
		String telephone = request.getParameter("telephone");
		String email= request.getParameter("email");
		String civilite =request.getParameter("civilite");
		String genre = request.getParameter("genre");
		String cni = request.getParameter("cni");
		double solde = Double.parseDouble(request.getParameter("solde"));
		String type_compte = request.getParameter("type_compte");
		String username= request.getParameter("username");
		String password =request.getParameter("password");
		Client client= new Client(nom, prenom, adresse, datenaissance, telephone, email, civilite, genre, cni);
		Compte compte = new Compte(solde, type_compte);
		User   user = new User(username, password);
		metier.addClient(client, compte, user);
		//redirection Apres enregistrement
		

		request.getRequestDispatcher("/templates/viewClient/listeclientActive").forward(request, response);
		
		
		
		
	}
}
