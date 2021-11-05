package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.StudentDao;
import org.library.web.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterStudentController
 */
@WebServlet("/RegisterStudent")
public class RegisterStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	boolean flag;
    /**
     * Default constructor. 
     */
    public RegisterStudentController() {
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("fname");
		String gender=request.getParameter("gender");
		String dateOfBirth=request.getParameter("dateOfBirth");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		
		Student s=new Student(fname,lname,gender,dateOfBirth,contact,email);
		StudentDao sd=new StudentDao();
		
		try {
			flag = sd.Insert(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(fname);
		out.println(",Registration successful");
		response.sendRedirect("StudentList");
		
		
		//RequestDispatcher rd=request.getRequestDispatcher("users.jsp");
		//rd.forward(request, response);
		
	}

}
