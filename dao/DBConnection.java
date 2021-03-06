package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String url = "jdbc:mysql://localhost:3306/bootCamp";
	private static final String username = "root";
	private static final String password = "pwd";
	private static Connection connection;
	private static DBConnection instance;
	
	
	
	private DBConnection (Connection connection) {
		this.connection= connection;

	}
	
	public static Connection getConnection() {
		
		if (instance == null) {
			
		try {
            connection= DriverManager.getConnection(url, "username", "password");
            instance = new DBConnection(connection);
			
			System.out.println("Succefully connected");
			
			
		} catch (SQLException e) {
			System.out.println("Unable to connect, try again");
			e.printStackTrace();
		}finally {
			if (instance != null) {
				System.out.println("______________________\nclosing connection now");
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Connection closed successfully"); // for closing connection very important to 
			}

		
	
	}
}return DBConnection.connection;
	}		
	}

