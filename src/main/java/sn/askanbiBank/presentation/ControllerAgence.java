package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.modeler.modules.ModelerSource;

import sn.askanbiBank.dao.IdaoAddAgent;
import sn.askanbiBank.dao.IdaoAddAgentImpl;
import sn.askanbiBank.dao.IdaoAddCompte;
import sn.askanbiBank.dao.IdaoAddCompteImpl;
import sn.askanbiBank.dao.IdaoAgence;
import sn.askanbiBank.dao.IdaoAgenceImpl;
import sn.askanbiBank.dao.IdaoClient;
import sn.askanbiBank.dao.IdaoClientImpl;
import sn.askanbiBank.dao.IdaoCompte;
import sn.askanbiBank.dao.IdaoCompteImpl;
import sn.askanbiBank.dao.IdaoUser;
import sn.askanbiBank.dao.IdaoUserImpl;
import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.model.AgenceModel;
import sn.askanbiBank.model.AgentModel;
import sn.askanbiBank.model.ClientModel;
import sn.askanbiBank.model.OperationModel;

/**
 * Servlet implementation class ControllerAgence
 */
@WebServlet("/templates/viewSiege/")
public class ControllerAgence extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoAgence metier;
	private AgenceModel modelagence;
	private ClientModel modelclient;
	private OperationModel modeloperation;
	private AgentModel modelagent;
	private IdaoCompte metierclient;
	private IdaoAddAgent metieragent;
	private IdaoAddAgent agent;
	private IdaoUser user;
	
	
	public void init() throws ServletException {
		 metier= new IdaoAgenceImpl();
		 modelagence = new AgenceModel();
		 modelclient = new ClientModel();
		 modeloperation= new OperationModel();
		 modelagent = new AgentModel();
		 metierclient= new IdaoCompteImpl();
		 metieragent= new IdaoAddAgentImpl();
		 agent= new IdaoAddAgentImpl();
		 user = new IdaoUserImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAgence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action!=null) {
			if(action.equals("listeagence")) {
			List<Agence> agences = metier.liste();
			modelagence.setAgences(agences);
			request.setAttribute("modelagence", modelagence);
			request.getRequestDispatcher("ListeAgence.jsp").forward(request, response);	
			}
			else if(action.equals("listeclient")) {
				List<Compte> comptes =metier.listeClient();
				modelclient.setComptes(comptes);
				request.setAttribute("modelclient", modelclient);
				request.getRequestDispatcher("Listeclient.jsp").forward(request, response);	
				
			}
			else if(action.equals("listeoperation")) {
				List<Operation> operations =metier.listeOperations();
				modeloperation.setOperations(operations);
				request.setAttribute("modeloperation", modeloperation);
				request.getRequestDispatcher("ListeOperation.jsp").forward(request, response);
				
			}
			else if (action.equals("listeagent")) {
				List<User> users= metier.listeAgent();
				modelagent.setUsers(users);
				request.setAttribute("modelagent", modelagent);
				request.getRequestDispatcher("ListeAgent.jsp").forward(request, response);
				
			}
			else if(action.equals("listeclientagence")) {
				ClientModel model = new ClientModel();
				int id= Integer.parseInt(request.getParameter("id"));
				List<Compte> comptes= metierclient.listeparagence(id);
				model.setComptes(comptes);
				request.setAttribute("model",model);
				request.getRequestDispatcher("ListeClientAgence.jsp").forward(request, response);
			}
			else if(action.equals("listeagentagence")) {
				AgentModel model = new AgentModel();
				int id= Integer.parseInt(request.getParameter("id"));
				List<User> users =metieragent.listUser(id);
				model.setUsers(users);
				request.setAttribute("model",model);
				request.getRequestDispatcher("ListeAgentAgence.jsp").forward(request, response);
			}
			else if(action.equals("desigeradmin")) {
				List<Agence> sansadmin= metier.sansadmin();
				modelagence.setAgences(sansadmin);
				request.setAttribute("modelagence", modelagence);
				int id= Integer.parseInt(request.getParameter("id"));
				Agent a= agent.getByID(id);
				User u= user.getByID(id);
				modelagent.setAgent(a);
				modelclient.setUser(u);
				request.getRequestDispatcher("DesignerAdmin.jsp").forward(request, response);

			}
			else if (action.equals("designer")) {
				User u= new User();
				Agent a= new Agent();
				int id= Integer.parseInt(request.getParameter("id"));
				 a= agent.getByID(id);
				 u= user.getByID(id);
				 a.getAgence().setIdagence(Integer.parseInt(request.getParameter("idagence")));
				 metier.designeradmin(a, u);
				 
				request.getRequestDispatcher("ListeAgent.jsp").forward(request, response);
				
			}
			
			
		}
		else {
			request.getRequestDispatcher("ListeAgence.jsp").forward(request, response);
		}
	}

}
