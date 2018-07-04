package diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diary.daos.EntryDAO;

@WebServlet("/EntryDelete")
public class EntryDelete extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	// Getting list of entries from DB and sending to JSP view
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("EntryDelete servlet");

		EntryDAO entryDao = new EntryDAO();
		entryDao.delete(Integer.parseInt(req.getParameter("id")));
		

		resp.sendRedirect(req.getContextPath() +"/EntryIndex");
	}
}