package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
<<<<<<< HEAD
	private static final String url = "jdbc:mysql://localhost:3306/bootCamp";
	private static final String username = "root";
	private static final String password = "Zakkary123";
=======
	private final static String url = "jdbc:mysql://localhost:3306/bootcamp";
	private final static String username = "root";
	private final static String password = "password";
>>>>>>> befe4d1fc5c723a3c5d534285ca9e80a6fee4c1f
	private static Connection connection;
	private static DBConnection instance;

	private DBConnection(Connection connection) {
		DBConnection.connection = connection;

	}

	public static Connection getConnection() {

		if (instance == null) {
<<<<<<< HEAD
			
		try {
            connection= DriverManager.getConnection(url, "root", "Zakkary123");
            instance = new DBConnection(connection);
			
			System.out.println("Succefully connected");
			
			
		} catch (SQLException e) {
			System.out.println("Unable to connect, try again");
			e.printStackTrace();
		}
		/*finally {
			if (instance != null) {
				System.out.println("______________________\nclosing connection now");
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Connection closed successfully"); // for closing connection very important to 
			}*/

		
	
	}
return DBConnection.connection;
	}		
=======

			try {
				connection = DriverManager.getConnection(url, username, password);
				instance = new DBConnection(connection);

				System.out.println("Successfully connected");

			} catch (SQLException e) {
				System.out.println("Unable to connect, try again");
				e.printStackTrace();
			} finally {
				if (instance != null) {
					System.out.println("______________________\nclosing connection now");
					try {
						connection.close();
						System.out.println("Connection closed successfully"); // for closing connection very important to

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}
		}
		return DBConnection.connection;
>>>>>>> befe4d1fc5c723a3c5d534285ca9e80a6fee4c1f
	}
}
