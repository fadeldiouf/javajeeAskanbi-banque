package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.askanbiBank.dao.IdaoAddAgent;
import sn.askanbiBank.dao.IdaoAddAgentImpl;
import sn.askanbiBank.dao.IdaoAgent;
import sn.askanbiBank.dao.IdaoAgentImpl;
import sn.askanbiBank.dao.IdaoCompte;
import sn.askanbiBank.dao.IdaoCompteImpl;
import sn.askanbiBank.dao.IdaoOperation;
import sn.askanbiBank.dao.IdaoOperationImpl;
import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.model.AgentModel;
import sn.askanbiBank.model.ClientModel;
import sn.askanbiBank.model.OperationModel;

/**
 * @author NIANG
 *
 */
@WebServlet("/templates/viewAgent/")
public class ControlerAgent extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoAgent metier;
	private IdaoAgent listeuser;
	private IdaoAddAgent dao;
	private IdaoCompte listerclient;
	private IdaoOperation idaoop;
	private OperationModel model1;
	
	public void init() throws ServletException {
		metier= new IdaoAgentImpl();
		dao= new IdaoAddAgentImpl();
		listeuser= new IdaoAgentImpl();
		listerclient= new IdaoCompteImpl();
		idaoop= new IdaoOperationImpl();
		model1= new OperationModel();
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
		AgentModel model = new AgentModel();
		HttpSession session1 = request.getSession();
		int idagence =Integer.parseInt(session1.getAttribute("id_agence").toString());
		List<User> users =dao.listUser(idagence);
		model.setUsers(users);
		request.setAttribute("model",model);
		if (action!=null) {
			if (action.equals("editer")) {
   				int id= Integer.parseInt(request.getParameter("id"));
				Agent a= metier.getByID(id);
				model.setAgent(a );
//				request.setAttribute("model",model);
				request.getRequestDispatcher("ModifierAgent.jsp").forward(request, response);
			}
			
			else if (action.equals("ajouter")) {
				    HttpSession session = request.getSession();
				    Agent agent =new Agent();
				    Agence agence= new Agence();
				    User user= new User();
				    System.out.println(session.getAttribute("ID"));
					agence.setIdagence(Integer.parseInt(session.getAttribute("id_agence").toString()));
					agent.setAgence(agence);
					agent.setNom(request.getParameter("nom"));
					agent.setPrenom(request.getParameter("prenom"));
					agent.setAdresse(request.getParameter("adresse"));
					agent.setDatenaissance(request.getParameter("datenaissance"));
					agent.setTelephone(request.getParameter("telephone"));
					agent.setEmail(request.getParameter("email"));
					agent.setGenre(request.getParameter("genre"));
					agent.setCivilite(request.getParameter("civilite"));
					agent.setCni(request.getParameter("cni"));
					user.setUsername(request.getParameter("username"));
					user.setPassword(request.getParameter("password"));
					dao.addAgent(agent,user); 
				request.getRequestDispatcher("listeAgent.jsp").forward(request, response);
					
			}
			else if (action.equals("modif")) {
				  try{
					model.getAgent().setNom(request.getParameter("nom"));
					model.getAgent().setPrenom(request.getParameter("prenom"));
					model.getAgent().setAdresse(request.getParameter("adresse"));
					model.getAgent().setDatenaissance(request.getParameter("datenaissance"));
					model.getAgent().setTelephone(request.getParameter("telephone"));
					model.getAgent().setEmail(request.getParameter("email"));
					model.getAgent().setGenre(request.getParameter("genre"));
					model.getAgent().setCivilite(request.getParameter("civilite"));
					model.getAgent().setCni(request.getParameter("cni"));
					model.getAgent().setIdagent(Integer.parseInt(request.getParameter("idagent")));
					metier.update(model.getAgent());
				  }catch (Exception e) {
					// TODO: handle exception
					  e.printStackTrace();
				}
			request.getRequestDispatcher("listeAgent.jsp").forward(request, response);
			} 
			else if(action.equals("detail")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Agent a= listeuser.getByID(id);
				model.setAgent(a);
//				request.setAttribute("model",model);
				request.getRequestDispatcher("DetailAgent.jsp").forward(request, response);
			}
			else if(action.equals("listeclient")) {
				ClientModel modelclient = new ClientModel();
				HttpSession sessionclient = request.getSession();
				int idagenc =Integer.parseInt(sessionclient.getAttribute("id_agence").toString());
				List<Compte> comptes= listerclient.listeparagence(idagenc);
				modelclient.setComptes(comptes);
				request.setAttribute("modelclient",modelclient);
				request.getRequestDispatcher("listeClient.jsp").forward(request, response);
			}
			else if(action.equals("listeoperation")) {
				HttpSession opsession1 = request.getSession();
				int idagence1 =Integer.parseInt(opsession1.getAttribute("id_agence").toString());
				List<Operation> operations=idaoop.listopagence(idagence1);
				model1.setOperations(operations);
				request.setAttribute("model1", model1);
				request.getRequestDispatcher("Listeoperation.jsp").forward(request, response);
				
			}
			
			
			
		}
		else {
			request.getRequestDispatcher("listeAgent.jsp").forward(request, response);
		}
		
	}
	

}
