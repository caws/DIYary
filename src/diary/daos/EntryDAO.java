package diary.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import diary.database.ConnectionFactory;
import diary.models.Entry;

public class EntryDAO {

	  // Receiving a connection to the database
	  private Connection connection;

	  public EntryDAO() {
	    this.connection = new ConnectionFactory().getConnection();
	  }
	  
	  public void insert(Entry entry) {
		    String sql = "INSERT INTO diyary.entry " +
		                 "(entry_date, author_name, entry_text)" +
		                 "VALUES (?,?,?)";

		    try {
		        // Prepared statement for insertion
		        PreparedStatement stmt = connection.prepareStatement(sql);

		        // Setting the values
		        stmt.setDate(1, entry.getEntryDate());
		        stmt.setString(2, entry.getAuthorName());
		        stmt.setString(3, entry.getEntryText());

		        // Executing
		        stmt.execute();
		        stmt.close();
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		}
	  
	}