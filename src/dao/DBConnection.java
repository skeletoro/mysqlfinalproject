package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private final static String url = "jdbc:mysql://localhost:3306/bootcamp";
	private final static String username = "root";
	private final static String password = "YOUR PW HERE !!!! leave this blank when you push please";
	private static Connection connection;
	private static DBConnection instance;

	private DBConnection(Connection connection) {
		DBConnection.connection = connection;

	}

	public static Connection getConnection() {

		if (instance == null) {

		}
		try {
			connection = DriverManager.getConnection(url, username, password);
			instance = new DBConnection(connection);

			System.out.println("Successfully connected");

		} catch (SQLException e) {
			System.out.println("Unable to connect, try again");
			e.printStackTrace();
		} return DBConnection.connection;
				}
				/*
				 * finally { if (instance != null) {
				 * System.out.println("______________________\nclosing connection now"); try {
				 * connection.close(); } catch (SQLException e) { e.printStackTrace(); }
				 * System.out.println("Connection closed successfully"); // for closing
				 * connection very important to }
				 */

		
		}
		

	
