package diary.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DiaryCreate")
public class DiaryCreate extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	//Creating a new diary and saving it on the DB
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Creating new diary entry.");
		System.out.println(req.getParameter("date"));
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("entry"));
		
		//Sending the user back to the main page
		resp.sendRedirect("/diary/index.jsp");
	}	

}