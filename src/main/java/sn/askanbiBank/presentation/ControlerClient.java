package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.askanbiBank.dao.IdaoAddCompte;
import sn.askanbiBank.dao.IdaoAddCompteImpl;
import sn.askanbiBank.dao.IdaoClient;
import sn.askanbiBank.dao.IdaoClientImpl;
import sn.askanbiBank.dao.IdaoCompte;
import sn.askanbiBank.dao.IdaoCompteImpl;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.model.ClientModel;

/**
 * @author Fadilou
 *
 */
@WebServlet("/templates/viewClient/")
public class ControlerClient extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoClient metier;
	private IdaoCompte listerclient;
	private IdaoAddCompte dao;
	
	public void init() throws ServletException {
		metier= new IdaoClientImpl();
		dao= new IdaoAddCompteImpl();
		listerclient= new IdaoCompteImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		ClientModel model = new ClientModel();
		HttpSession session1 = request.getSession();
		int idagence =Integer.parseInt(session1.getAttribute("id_agence").toString());
		List<Compte> comptes= listerclient.listeparagence(idagence);
		model.setComptes(comptes);
		request.setAttribute("model",model);
		if (action!=null) {
			if (action.equals("editer")) {
   				int id= Integer.parseInt(request.getParameter("id"));
				Client c= metier.getByID(id);
				model.setClient(c );
//				request.setAttribute("model",model);
				request.getRequestDispatcher("ModifierClient.jsp").forward(request, response);
			}
			
			else if (action.equals("ajouter")) {
				HttpSession session = request.getSession();
				Client client = new Client();
				Compte compte = new Compte();
				User user = new User();
				Agent agent = new Agent();
				System.out.println(session.getAttribute("ID"));
				agent.setIdagent(Integer.parseInt(session.getAttribute("ID").toString()));
				client.setAgent(agent);
				client.setNom(request.getParameter("nom"));
				client.setPrenom(request.getParameter("prenom"));
				client.setAdresse(request.getParameter("adresse"));
				client.setDatenaissance(request.getParameter("datenaissance"));
				client.setTelephone(request.getParameter("telephone"));
				client.setEmail(request.getParameter("email"));
				client.setCivilite(request.getParameter("civilite"));
				client.setGenre(request.getParameter("genre"));
				client.setCni(request.getParameter("cni"));
				compte.setSolde(Double.parseDouble(request.getParameter("solde")));
				compte.setType_compte(request.getParameter("type_compte"));
                user.setUsername(request.getParameter("username"));
                user.setPassword(request.getParameter("password"));
			    dao.addClient(client, compte, user);
				request.getRequestDispatcher("listeclientActive.jsp").forward(request, response);
					
			}
			else if (action.equals("modif")) {
				  try{
					model.getClient().setNom(request.getParameter("nom"));
					model.getClient().setPrenom(request.getParameter("prenom"));
					model.getClient().setAdresse(request.getParameter("adresse"));
					model.getClient().setDatenaissance(request.getParameter("datenaissance"));
					model.getClient().setTelephone(request.getParameter("telephone"));
					model.getClient().setEmail(request.getParameter("email"));
					model.getClient().setCivilite(request.getParameter("civilite"));
					model.getClient().setGenre(request.getParameter("genre"));
					model.getClient().setCni(request.getParameter("cni"));
					model.getClient().setIdclient(Integer.parseInt(request.getParameter("idclient")));
					metier.update(model.getClient());
				  }catch (Exception e) {
					// TODO: handle exception
					  e.printStackTrace();
				}
			request.getRequestDispatcher("listeclientActive.jsp").forward(request, response);
			}
			else if(action.equals("detail")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Compte c= listerclient.getByID(id);
				model.setCompte(c);
//				request.setAttribute("model",model);
				request.getRequestDispatcher("DetailClient.jsp").forward(request, response);
			}
			else if(action.equals("activer")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Compte c =listerclient.getById(id);
				c.setActive(true);
				listerclient.active(c);
				request.getRequestDispatcher("listeclientActive.jsp").forward(request, response);
				
			}
			else if(action.equals("desactiver")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Compte c =listerclient.getById(id);
				c.setActive(false);
				listerclient.active(c);
				request.getRequestDispatcher("listeclientActive.jsp").forward(request, response);
				
			}

		}
		else {
			request.getRequestDispatcher("listeclientActive.jsp").forward(request, response);
		}
		
	}
	

}
