package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Instructors;


public class InstructorDao {

	private Connection connection;

	

    
	private final String ADD_NEW_INSTRUCTOR_QUERY = "INSERT INTO instructors (instructor_name, instructor_email) VALUES (?,?)";

	private final String DELETE_INSTRUCTOR_BY_ID_QUERY = "DELETE from instructors WHERE instructor_id = ?";

	private final String UPDATE_INSTRUCTOR_BY_ID_QUERY = "UPDATE instructors SET instructor_name = ?, instructor_email = ? WHERE instructor_id = ?";

	public InstructorDao() {

		connection = DBConnection.getConnection();
	}
	
	

	public void addInstructor(String instructorName, String instructorEmail) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(ADD_NEW_INSTRUCTOR_QUERY);

		ps.setString(1, instructorName);
		ps.setString(2, instructorEmail);
		ps.executeUpdate();
	}

	public void deleteInstructor(int instructorId) throws SQLException {

		PreparedStatement ps = connection.prepareStatement (DELETE_INSTRUCTOR_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.executeUpdate();
	}
	

	public void updateInstructor(String instructorName, String instructorEmail, int instructorId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_INSTRUCTOR_BY_ID_QUERY);
		ps.setString(1, instructorName);
		ps.setString(2, instructorEmail);
		ps.setInt(3, instructorId);
		ps.executeUpdate();

	}



	public void getCoursesByInstructor() {
		// TODO Auto-generated method stub
		
	}

}
