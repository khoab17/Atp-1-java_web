package org.library.web;

import java.io.IOException;
import java.util.List;

import org.library.web.dao.RequestDao;
import org.library.web.model.Request;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RequestListStudentController /RequestListStudent
 */
public class RequestListStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RequestListStudentController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession(false);
		int id=(Integer)session.getAttribute("studentId");
		
		RequestDao rd=new RequestDao();
		List<Request> requests=rd.GetRequest(id);
		
		request.setAttribute("requests", requests);
		RequestDispatcher dispatcher=request.getRequestDispatcher("requestListStudent.jsp");
		dispatcher.forward(request, response);
		
	}

}
