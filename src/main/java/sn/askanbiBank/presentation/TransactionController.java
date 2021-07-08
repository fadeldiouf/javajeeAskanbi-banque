package sn.askanbiBank.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.askanbiBank.dao.IdaoCompte;
import sn.askanbiBank.dao.IdaoCompteImpl;
import sn.askanbiBank.dao.IdaoOperation;
import sn.askanbiBank.dao.IdaoOperationImpl;
import sn.askanbiBank.domaine.Compte;

/**
 * @author Fadilou
 *
 */
@WebServlet("/templates/viewClient/operation/")
public class TransactionController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoCompte idaocompte;
	private IdaoOperation idaoop; 

	
	public void init() throws ServletException {
		idaocompte= new IdaoCompteImpl();
		idaoop= new IdaoOperationImpl();
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String verify= request.getParameter("verify");
		HttpSession session= request.getSession();
		HttpSession session1= request.getSession();
		HttpSession session2= request.getSession();
		HttpSession session3= request.getSession();
		HttpSession session4= request.getSession();
		
		
			Long num_compte= Long.parseLong(request.getParameter("num_compte"));
			Compte c= idaocompte.verification(num_compte);
			if(c != null) {
			String nom= c.getClient().getNom();
			String prenom= c.getClient().getPrenom();
			Double solde= c.getSolde();
			int idcompte= c.getIdcompte();
			session.setAttribute("num_compte", num_compte);
			session1.setAttribute("nom", nom);
			session2.setAttribute("prenom", prenom);
			session4.setAttribute("solde", solde);
			session3.setAttribute("idcompte", idcompte);
			if (verify.equals("verif2")) {
		request.getRequestDispatcher("Retrait.jsp").forward(request, response);
			}
			else if(verify.equals("verif3")) {
				request.getRequestDispatcher("Verification4.jsp").forward(request, response);
			}
			
		}
			HttpSession session6= request.getSession();
			HttpSession session7= request.getSession();
			HttpSession session8= request.getSession();
			HttpSession session9= request.getSession();
			HttpSession session10= request.getSession();
			Long num_compte_dess = Long.parseLong(request.getParameter("num_compte_dess"));
			Compte cdess= idaocompte.verification2(num_compte_dess);
			if(cdess != null) {
			String nom_dess= cdess.getClient().getNom();
			String prenom_dess= cdess.getClient().getPrenom();
			Double solde_dess= cdess.getSolde();
			int idcompte_dess= cdess.getIdcompte();
			session6.setAttribute("num_compte_dess", num_compte_dess);
			session7.setAttribute("nom_dess", nom_dess);
			session8.setAttribute("prenom_dess", prenom_dess);
			session9.setAttribute("solde_dess", solde_dess);
			session10.setAttribute("idcompte_dess", idcompte_dess);
			if (verify.equals("verif4"))  {
				request.getRequestDispatcher("Virement.jsp").forward(request, response);
			}
			}
		
		
	}	
	
}
