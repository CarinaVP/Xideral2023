package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class TelefonoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TelefonoDbUtil telefonoDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			telefonoDbUtil = new TelefonoDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listStudents(request, response);
				break;
				
			case "ADD":
				addStudent(request, response);
				break;
				
			case "LOAD":
				loadStudent(request, response);
				break;
				
			case "UPDATE":
				updateStudent(request, response);
				break;
			
			case "DELETE":
				deleteStudent(request, response);
				break;
				
			default:
				listStudents(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student id from form data
		String theStudentId = request.getParameter("studentId");
		
		// delete student from database
		telefonoDbUtil.deleteStudent(theStudentId);
		
		// send them back to "list students" page
		listStudents(request, response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student info from form data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String nombreTelefono = request.getParameter("nombreTelefono");
		String dueño = request.getParameter("dueño");
		String detalle = request.getParameter("detalle");
		
		// create a new student object
		Telefono theStudent = new Telefono(id, nombreTelefono, dueño, detalle);
		
		// perform update on database
		telefonoDbUtil.updateStudent(theStudent);
		
		// send them back to the "list students" page
		listStudents(request, response);
		
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read student id from form data
		String theStudentId = request.getParameter("studentId");
		
		// get student from database (db util)
		Telefono theStudent = telefonoDbUtil.getStudent(theStudentId);
		
		// place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);
		
		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-student-form.jsp");
		dispatcher.forward(request, response);		
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String nombreTelefono = request.getParameter("nombreTelefono");
		String dueño = request.getParameter("dueño");
		String detalle = request.getParameter("detalle");		
		
		// create a new student object
		Telefono theStudent = new Telefono(nombreTelefono, dueño, detalle);
		
		// add the student to the database
		telefonoDbUtil.addStudent(theStudent);
				
		// send back to main page (the student list)
		listStudents(request, response);
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Telefono> telefonos = telefonoDbUtil.getStudents();
		
		// add students to the request
		request.setAttribute("STUDENT_LIST", telefonos);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
	}

}













