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
import sn.askanbiBank.domaine.Agent;
import sn.askanbiBank.domaine.Compte;
import sn.askanbiBank.domaine.Operation;
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
		    if (verify.equals("verif2")) {
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
				    request.getRequestDispatcher("Retrait.jsp").forward(request, response);
				}
				
		    }
		    
		    else if  (verify.equals("verif0")) {
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
				    request.getRequestDispatcher("Depot.jsp").forward(request, response);
				}
				
		    }
			else if(verify.equals("verif3")) {
				request.getRequestDispatcher("Verification4.jsp").forward(request, response);
			}
			else if (verify.equals("verif4")) {
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
					request.getRequestDispatcher("Virement.jsp").forward(request, response);
				} 
			}
			else if(verify.equals("depot")) {
				HttpSession retait1= request.getSession();
				HttpSession retait2= request.getSession();
				HttpSession retait3= request.getSession();
				HttpSession retait4= request.getSession();
				Operation op= new Operation();
				Compte compte= new Compte();
				Compte compte2= new Compte();
				Agent agent = new Agent();
				Double balance= Double.parseDouble(retait1.getAttribute("solde").toString());
				Long num_debite=Long.parseLong(retait2.getAttribute("num_compte").toString());
				agent.setIdagent(Integer.parseInt(retait3.getAttribute("ID").toString())); 
				compte2.setIdcompte(Integer.parseInt(retait4.getAttribute("idcompte").toString()));
				Double debite= Double.parseDouble(request.getParameter("debite").toString());
				Double solde= balance-debite;
				compte.setSolde(solde);
				compte.setNum_compte(num_debite);
				op.setAgent(agent);
				op.setCompte(compte2);
				op.setDebite(debite);
				idaoop.saveOperationRet(op, compte, num_debite);	
			}
		    
			else if(verify.equals("depotmontant")) {
				HttpSession depot1= request.getSession();
				HttpSession depot2= request.getSession();
				HttpSession depot3= request.getSession();
				HttpSession depot4= request.getSession();
				Operation opp= new Operation();
				Compte compt= new Compte();
				Compte compt2= new Compte();
				Agent agent = new Agent();
				Double balance= Double.parseDouble(depot1.getAttribute("solde").toString());
				Long num_credit=Long.parseLong(depot2.getAttribute("num_compte").toString());
				agent.setIdagent(Integer.parseInt(depot3.getAttribute("ID").toString())); 
				compt2.setIdcompte(Integer.parseInt(depot4.getAttribute("idcompte").toString()));
				Double credit= Double.parseDouble(request.getParameter("credit").toString());
				Double solde= balance + credit;
				compt.setSolde(solde);
				compt.setNum_compte(num_credit);
				opp.setAgent(agent);
				opp.setCompte(compt2);
				opp.setCredit(credit);
				idaoop.saveOperationDpt(opp, compt, num_credit);	
			}
			else if(verify.equals("virement")) {
				HttpSession virement1= request.getSession();
				HttpSession virement2= request.getSession();
				HttpSession virement3= request.getSession();
				HttpSession virement4= request.getSession();
				HttpSession virement5= request.getSession();
				HttpSession virement6= request.getSession();
				HttpSession virement7= request.getSession();
				Operation op1= new Operation();
				Operation op2= new Operation();
				Compte c1= new Compte();
				Compte c2= new Compte();
				Compte compte1= new Compte();
				Compte compte2= new Compte();
				Agent agent = new Agent();
				Double balance1= Double.parseDouble(virement1.getAttribute("solde").toString());
				Long num_envoie=Long.parseLong(virement2.getAttribute("num_compte").toString());
				agent.setIdagent(Integer.parseInt(virement3.getAttribute("ID").toString())); 
				compte1.setIdcompte(Integer.parseInt(virement4.getAttribute("idcompte").toString()));
				compte2.setIdcompte(Integer.parseInt(virement5.getAttribute("idcompte_dess").toString()));
				Double balance2= Double.parseDouble(virement6.getAttribute("solde_dess").toString());
				Long num_recue=Long.parseLong(virement7.getAttribute("num_compte_dess").toString());
				Double envoie= Double.parseDouble(request.getParameter("envoie").toString());
				Double solde1= balance1-envoie;
				Double solde2= balance2+envoie;
				c1.setSolde(solde1);
				c1.setNum_compte(num_envoie);
				op1.setAgent(agent);
				op1.setCompte(compte1);
				op1.setEnvoie(envoie);
				c2.setSolde(solde2);
				c2.setNum_compte(num_recue);
				op2.setAgent(agent);
				op2.setCompte(compte2);
				op2.setRecue(envoie);
				idaoop.saveOperationVrmt(op1, op2, c1, c2, num_envoie, num_recue);
		
				
			}
			else
				
				request.getRequestDispatcher("Verification2.jsp").forward(request, response);
			}	
			
			
	}	
	
