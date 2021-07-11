package sn.askanbiBank.presentation;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.askanbiBank.dao.IdaoAddAgent;
import sn.askanbiBank.dao.IdaoAddAgentImpl;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.User;
@WebServlet("/ajouerAgent")
public class Ajouteragent extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoAddAgent metier;
	
	public void init() throws ServletException{
		metier= new IdaoAddAgentImpl();
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
		String genre = request.getParameter("genre");
		String civilite =request.getParameter("civilite");
		String cni = request.getParameter("cni");
		String username= request.getParameter("username");
		String password =request.getParameter("password");
		Agent agent= new Agent(0, nom, prenom, adresse, datenaissance, telephone, email, genre, civilite, cni);
		User   user = new User(username, password); 
		metier.addAgent(agent, user);
		//redirection Apres enregistrement
		

		request.getRequestDispatcher("/templates/viewAgent/listeAgent").forward(request, response);
		
		
		
		
	}
}
