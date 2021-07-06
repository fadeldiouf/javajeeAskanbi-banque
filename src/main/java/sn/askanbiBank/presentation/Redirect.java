package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.modeler.modules.ModelerSource;

import sn.askanbiBank.dao.IdaoUser;
import sn.askanbiBank.dao.IdaoUserImpl;
import sn.askanbiBank.domaine.User;
import sn.askanbiBank.model.ClientModel;

/**
 * Servlet implementation class Redirect
 */
@WebServlet("/templates/")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirect() {
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
		IdaoUserImpl user =new IdaoUserImpl();
		IdaoUser user1 =new IdaoUserImpl();
		HttpSession session =request.getSession();
		HttpSession session1 =request.getSession();

		
			String username=request.getParameter("username");
			String password=request.getParameter("password");	
			String verify=user.verification(username, password);
			if (verify.equals("superadmin") || verify.equals("admin") || verify.equals("agent")) {
				session.setAttribute("verify",verify);
				User u= user1.authentification(username, password);
				String nom    =u.getAgent().getNom();
				String prenom =u.getAgent().getPrenom();
				int    ID     =u.getAgent().getIdagent();
				int  id_agence=u.getAgent().getAgence().getIdagence();
				String agence =u.getAgent().getAgence().getNomagence();
				session1.setAttribute("nom", nom);
				session1.setAttribute("prenom", prenom);
				session1.setAttribute("ID", ID);
				session1.setAttribute("id_agence", id_agence);
				session1.setAttribute("agence", agence);
				
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
			}
			
	         else
	         {
	             request.getRequestDispatcher("/index.jsp").forward(request, response);
	         }
			
		
	}
		

}
