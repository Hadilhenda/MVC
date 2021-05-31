package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.client1;

/**
 * Servlet implementation class clien
 */
@WebServlet("/clien")
public class clien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter( "nomClient" );
	        String prenom = request.getParameter( "prenomClient" );
	        String adresse = request.getParameter( "adresseClient" );
	        String telephone = request.getParameter( "telephoneClient" );
	        String email = request.getParameter( "emailClient" );
	
	        
	       
	        client1 client = new client1();
	        client.setNom(nom);
	        client.setPrenom(prenom);
	        client.setAdresse(adresse);
	        client.setTelephone(telephone);
	        client.setEmail(email);
	        
	        request.setAttribute( "client" ,client );
	        

	       
	        this.getServletContext().getRequestDispatcher( "/client.jsp" ).forward( request, response );
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}