package diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diary.daos.EntryDAO;

@WebServlet("/EntryIndex")
public class EntryIndex extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	// Getting list of entries from DB and sending to JSP view
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("EntryIndex servlet");

		// Sending the user do the index page along with all the entries
		EntryDAO entryDao = new EntryDAO();
		if (entryDao.all() != null) {
			req.setAttribute("entries", entryDao.all());			
		}
		req.getServletContext().getRequestDispatcher("/EntryIndex.jsp").forward(req, resp);
	}
}
