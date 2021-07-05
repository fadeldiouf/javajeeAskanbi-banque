package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.askanbiBank.dao.IdaoUserImpl;
import sn.askanbiBank.domaine.User;

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
		// TODO Auto-generated method stub
		IdaoUserImpl user =new IdaoUserImpl();
		HttpSession session =request.getSession();
		
		
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			User verify=user.authentification(username, password);
			if (verify.getRole().equals("superadmin") || verify.getRole().equals("admin") || verify.getRole().equals("user")) {
				session.setAttribute("verify",verify);
				
				
				
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
			}
			
	         else
	         {
	             request.getRequestDispatcher("/index.jsp").forward(request, response);
	         }
			
		
	}
		

}
