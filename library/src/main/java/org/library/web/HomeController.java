package org.library.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HomeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("email")!=null)
		{
			//String email=session.getId();
			//System.out.println(email);
			//request.setAttribute("email", email);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else
		response.sendRedirect("login.jsp");
	}

}
