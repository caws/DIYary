package diary.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diary.daos.EntryDAO;
import diary.models.Entry;

@WebServlet("/EntryCreate")
public class EntryCreate extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	//Creating a new diary and saving it on the DB
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("EntryCreate servlet");
		System.out.println(req.getParameter("entryDate"));
		System.out.println(req.getParameter("authorName"));
		System.out.println(req.getParameter("entryText"));
		
		//Instantiating a new entry object to save in the database
		Entry newEntry = new Entry();
		newEntry.setEntryDate(java.sql.Date.valueOf(req.getParameter("entryDate")));
		newEntry.setAuthorName(req.getParameter("authorName"));
		newEntry.setEntryText(req.getParameter("entryText"));
		
		//Instantiating a DAO object and invoking its method called 'insert'
		//(To insert a new entry, duhhh)
		EntryDAO entryDao = new EntryDAO();
		entryDao.insert(newEntry);	
		
		//Sending the user back to the main page along with all the entries
		resp.sendRedirect(req.getContextPath() +"/EntryIndex");
	}	

}