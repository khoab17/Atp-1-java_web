package org.library.web;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutController
 */
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LogoutController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = request.getSession(false); 
		System.out.println("Before Delete"+request.getSession().getId());
		request.getSession().invalidate();
		System.out.println("After Delete"+request.getSession().getAttribute("email"));
		response.sendRedirect("login.jsp");
	}

}
