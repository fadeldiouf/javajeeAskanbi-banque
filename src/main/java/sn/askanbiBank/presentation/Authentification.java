package sn.askanbiBank.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.askanbiBank.dao.IdaoUser;
import sn.askanbiBank.dao.IdaoUserImpl;
import sn.askanbiBank.domaine.User;

@WebServlet("/templates/")
public class Authentification extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */

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
		IdaoUser user1 =new IdaoUserImpl();
		HttpSession session =request.getSession();
		HttpSession session1 =request.getSession();
		HttpSession session2 =request.getSession();
		HttpSession session3 =request.getSession();
		HttpSession session4 =request.getSession();
		HttpSession session5 =request.getSession();

		
			String username=request.getParameter("username");
			String password=request.getParameter("password");	
			User u= user1.authentification(username, password);
			String role   =u.getRole().getRole();
			String nom    =u.getAgent().getNom();
			String prenom =u.getAgent().getPrenom();
			int    ID     =u.getAgent().getIdagent();
			int  id_agence=u.getAgent().getAgence().getIdagence();
			String agence =u.getAgent().getAgence().getNomagence();
			if (role.equals("superadmin") || role.equals("admin") || role.equals("agent")) {
				session.setAttribute("role", role);
				session1.setAttribute("nom", nom);
				session2.setAttribute("prenom", prenom);
				session3.setAttribute("ID", ID);
				session4.setAttribute("id_agence", id_agence);
				session5.setAttribute("agence", agence);
					
				request.getRequestDispatcher("accueil.jsp").forward(request, response);
			}
			else
	         {
	             request.getRequestDispatcher("index.jsp").forward(request, response);
	         }
	    }
			
		
	}
		

