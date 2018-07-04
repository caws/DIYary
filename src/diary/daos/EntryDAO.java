package diary.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import diary.database.ConnectionFactory;
import diary.models.Entry;

public class EntryDAO {

	// Receiving a connection to the database
	private Connection connection;

	public EntryDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void insert(Entry entry) {
		String sql = "INSERT INTO diyary.entry " + "(entry_date, author_name, entry_text)" + "VALUES (?,?,?)";

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

	public void delete(Integer id) {
		String sql = "DELETE from diyary.entry where id = ?";

		try {
			// Prepared statement for insertion
			PreparedStatement stmt = connection.prepareStatement(sql);

			// Setting the values
			stmt.setInt(1, id);

			// Executing
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Entry findById(Integer id) {
		String sql = "SELECT * FROM diyary.entry where id = ?";

		try {
			// Prepared statement for insertion
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);

			// Executing query
			ResultSet rs = stmt.executeQuery();
			
			Entry anEntry = new Entry();
			while (rs.next()) {
				anEntry.setId(rs.getInt("id"));
				anEntry.setAuthorName(rs.getString("author_name"));
				anEntry.setEntryDate(rs.getDate("entry_date"));
				anEntry.setEntryText(rs.getString("entry_text"));
			}

			// Closing connection
			stmt.close();

			// Returning all entries
			return anEntry;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Entry> all() {
		String sql = "SELECT * FROM diyary.entry";

		try {
			// Creating an empty arraylist
			ArrayList<Entry> allEntries = new ArrayList<>();

			// Prepared statement for insertion
			PreparedStatement stmt = connection.prepareStatement(sql);

			// Executing query
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Entry anEntry = new Entry();
				anEntry.setId(rs.getInt("id"));
				anEntry.setAuthorName(rs.getString("author_name"));
				anEntry.setEntryDate(rs.getDate("entry_date"));
				anEntry.setEntryText(rs.getString("entry_text"));

				// Adding this to the list
				allEntries.add(anEntry);
			}
			// Closing connection
			stmt.close();

			// Returning all entries
			return allEntries;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}