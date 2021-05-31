package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Sommation;
/**
 * Servlet implementation class somme
 */
@WebServlet("/Somme")
public class somme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public somme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int nbre1 = Integer.parseInt(request.getParameter("nbre1"));
		int nbre2 = Integer.parseInt(request.getParameter("nbre2"));
		Sommation s = new Sommation();
		s.setNbre1(nbre1);
		s.setNbre2(nbre2);
		int resulat =s.add(nbre1,nbre2);
		session.setAttribute("somme", s);
		session.setAttribute("resulat", resulat);
		this.getServletContext().getRequestDispatcher( "/somme.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}