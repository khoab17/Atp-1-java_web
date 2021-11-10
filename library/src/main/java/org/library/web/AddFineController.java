package org.library.web;

import java.io.IOException;

import org.library.web.dao.IssueDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFineController
 */
public class AddFineController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddFineController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int issueId=Integer.parseInt( request.getParameter("id"));
		int fine=Integer.parseInt( request.getParameter("fine"));
        String comment=request.getParameter("comment"); 
        
        IssueDao issued=new IssueDao();
        issued.AddFine(issueId, fine, comment);
        response.sendRedirect("ReturnRequestAdmin");
        //System.out.print(issueId+" ..."+fine+" ......"+comment);
	}

}

