package org.library.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.library.web.dao.RequestDao;
import org.library.web.model.Request;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookRequestsController
 */
public class BookRequestsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BookRequestsController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Request> requests= new ArrayList<Request>();
		RequestDao reqd=new RequestDao();
		
		requests=reqd.GetRequest();
		
		request.setAttribute("requests", requests);
		RequestDispatcher rd=request.getRequestDispatcher("bookRequests.jsp");
		rd.forward(request, response);
		
	}

}
