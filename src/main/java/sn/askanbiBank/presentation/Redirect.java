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
@WebServlet("/Redirect")
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Object disp = null;
		IdaoUserImpl bd =new IdaoUserImpl();
		HttpSession session =request.getSession();
	
		String formul=request.getParameter("bouton");
		
		
		if(formul.equals("add"))
		{
			String login=request.getParameter("username");
			String pass=request.getParameter("password"); 
			
			//User l= new User();
			
			//LoginBean loginBean = new LoginBean(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
			 
	        //loginBean.setUserName(userName); //setting the username and password through the loginBean object then only you can get it in future.
	        // loginBean.setPassword(password);
			//l.setUsername(login);
			//l.setPassword(pass);
			
			String userValidate = bd.authentification(login,pass);
			
			if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
	         {
	             //request.setAttribute("userName", userName); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
	             request.getRequestDispatcher("jsp/accueil.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
	         }
	         else
	         {
	             //request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
	             request.getRequestDispatcher("/index.jsp").forward(request, response);//forwarding the request
	         }
			
			//ArrayList<User> liste = bd.authentification(login, pass);
			//if(liste.size()!=0)
			//{
			//session.setAttribute("listes",liste);
			//request.getRequestDispatcher("NewFile.html").forward(request, response);
			
			//}else
			//{
				
				//request.getRequestDispatcher("index.jsp").forward(request, response);
				
			//}
		}
		
	}
		
		/**
		String login=request.getParameter("username");
		String pass=request.getParameter("password"); 
		//IdaoUserImpl idaouserimpl=new IdaoUserImpl();
		String  validate=idaouserimpl.authentification(login, pass);
		if(validate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
        {
            //request.setAttribute("userName", userName); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
            request.getRequestDispatcher("/index.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
        }
        else
        {
          //  request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
            request.getRequestDispatcher("/index.jsp").forward(request, response);//forwarding the request
        }
		
		//HttpSession session = request.getSession();
		
		doGet(request, response);**/
	

}
