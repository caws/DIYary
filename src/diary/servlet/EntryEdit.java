package diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diary.daos.EntryDAO;

@WebServlet("/EntryEdit")
public class EntryEdit extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	//Creating a new diary and saving it on the DB
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("EntryEdit servlet");
		System.out.println(req.getParameter("id"));
		
		EntryDAO entryDao = new EntryDAO();
				
		if (entryDao.findById(Integer.parseInt(req.getParameter("id"))) != null) {
			req.setAttribute("entry", entryDao.findById(Integer.parseInt(req.getParameter("id"))));			
		}
		
		req.getServletContext().getRequestDispatcher("/EntryEdit.jsp").forward(req, resp);
	}	

}