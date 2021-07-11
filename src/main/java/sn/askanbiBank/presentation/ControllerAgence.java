package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.askanbiBank.dao.IdaoAddCompte;
import sn.askanbiBank.dao.IdaoAddCompteImpl;
import sn.askanbiBank.dao.IdaoAgence;
import sn.askanbiBank.dao.IdaoAgenceImpl;
import sn.askanbiBank.dao.IdaoClient;
import sn.askanbiBank.dao.IdaoClientImpl;
import sn.askanbiBank.dao.IdaoCompte;
import sn.askanbiBank.dao.IdaoCompteImpl;
import sn.askanbiBank.domaine.Agence;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.model.AgenceModel;
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
	
	
	public void init() throws ServletException {
		 metier= new IdaoAgenceImpl();
		 modelagence = new AgenceModel();
		 modelclient = new ClientModel();
		 modeloperation= new OperationModel();
		
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
				
			}
			
			
		}
		else {
			request.getRequestDispatcher("ListeAgence.jsp").forward(request, response);
		}
	}

}
