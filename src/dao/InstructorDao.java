package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Instructors;

<<<<<<< HEAD
public class InstructorDao {
=======
	private Connection connection;
>>>>>>> 57f756e86493f319e26a5139bc596be800a12975
	
    private Connection connection;
    
	private final String ADD_NEW_INSTRUCTOR_QUERY = "INSERT INTO instructors (instructor_name, instructor_email) VALUES (?,?)";

	private final String DELETE_INSTRUCTOR_BY_ID_QUERY = "DELETE from instructors WHERE instructor_id = ?";

	private final String UPDATE_INSTRUCTOR_BY_ID_QUERY = "UPDATE instructors SET instructor_name = ?, instructor_email = ? WHERE instructor_id = ?";

	public InstructorDao() {
<<<<<<< HEAD
		
		connection = DBConnection.getConnection();
	}
	
	public void addInstructor(String instructorName, String instructorEmail) throws SQLException {
		PreparedStatement ps = connection.prepareStatement (ADD_NEW_INSTRUCTOR_QUERY);
=======
		connection = DBConnection.getConnection();
	}

	public void addInstructor(String instructorName, String instructorEmail) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(ADD_NEW_INSTRUCTOR_QUERY);
>>>>>>> 57f756e86493f319e26a5139bc596be800a12975
		ps.setString(1, instructorName);
		ps.setString(2, instructorEmail);
		ps.executeUpdate();
	}

	public void deleteInstructor(int instructorId) throws SQLException {
<<<<<<< HEAD
		PreparedStatement ps = connection.prepareStatement (DELETE_INSTRUCTOR_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.executeUpdate();
	}
	
	public void updateInstructor(String instructorName, String instructorEmail, int instructorId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement (UPDATE_INSTRUCTOR_BY_ID_QUERY);
				ps.setString(1, instructorName);
				ps.setString(2, instructorEmail);
				ps.setInt(3, instructorId);
				ps.executeUpdate();				
		
=======
		PreparedStatement ps = connection.prepareStatement(DELETE_INSTRUCTOR_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.executeUpdate();
	}

	public void updateInstructor(String instructorName, String instructorEmail, int instructorId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_INSTRUCTOR_BY_ID_QUERY);
		ps.setString(1, instructorName);
		ps.setString(2, instructorEmail);
		ps.setInt(3, instructorId);
		ps.executeUpdate();

>>>>>>> 57f756e86493f319e26a5139bc596be800a12975
	}

}
