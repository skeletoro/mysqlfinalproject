package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/bootCamp";
	private static final String username = "root";
	private static final String password = "pwd";
	private static Connection conn;
	private static DbConnection instance;
	
	
	
	private DbConnection (Connection conn) {
		this.conn = conn;

	}
	
	public static Connection getConnection() {
		
		if (instance == null) {
			
		try {
            conn = DriverManager.getConnection(url, "username", "password");
            instance = new DbConnection(conn);
			
			System.out.println("Succefully connected");
			
			
		} catch (SQLException e) {
			System.out.println("Unable to connect, try again");
			e.printStackTrace();
		}finally {
			if (instance != null) {
				System.out.println("______________________\nclosing connection now");
				conn.close();
				System.out.println("Connection closed successfully"); // for closing connection very important to 
			}

		
	
	}
}return DbConnection.conn;
	}		
	}

