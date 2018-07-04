package diary.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {		
	     try {
	    	 DriverManager.registerDriver(new com.mysql.jdbc.Driver());	
	         return DriverManager.getConnection("jdbc:mysql://localhost/diyary", "root", "qwertypoiu");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }

}
