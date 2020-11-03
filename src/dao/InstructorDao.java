package dao;

import java.sql.PreparedStatement;

public class InstructorDao {

	
	private final String ADD_NEW_INSTRUCTOR_QUERY = "INSERT INTO instructors (instructor_name, instructor_email) VALUES (?,?)";
	
	private final String DELETE_INSTRUCTOR_BY_ID_QUERY = "DELETE from instructors WHERE instructor_id = ?";
	
	private final String UPDATE_INSTRUCTOR_BY_ID_QUERY = "UPDATE instructors SET instructor_name = ?, instructor_email = ? WHERE instructor_id = ?";

	public InstructorDao() {
		connection = DBconnection.getConnection();
	}
	
	public void addInstructor(String instructorName, String instructorEmail) {
		PreparedStatement ps = connection.prepareStatement (ADD_NEW_INSTRUCTOR_QUERY);
		ps.setString(1, instructorName);
		ps.setString(2, instructorEmail);
		ps.executeUpdate();
	}

	public void deleteInstructor(int instructorId) {
		PreparedStatement ps = connection.prepareStatement (DELETE_INSTRUCTOR_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.executeUpdate();
	}
	
	public void updateInstructor(String instructorName, String instructorEmail, int instructorId) {
		PreparedStatement ps = connection.prepareStatement (UPDATE_INSTRUCTOR_BY_ID_QUERY);
				ps.setString(1, instructorName);
				ps.setString(2, instructorEmail);
				ps.setInt(3, instructorId);
				ps.executeUpdate();				
		
	}

}
