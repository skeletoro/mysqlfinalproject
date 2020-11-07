package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Instructors;

public class InstructorDao {

	private Connection connection;

	private String DISPLAY_INSTRUCTORS_QUERY = "select * from instructors";

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

	}

	public List<Instructors> displayInstructors() throws SQLException {
		ResultSet rs = connection.prepareStatement(DISPLAY_INSTRUCTORS_QUERY).executeQuery();
		List<Instructors> instructors = new ArrayList<Instructors>();
		while (rs.next()) {
			System.out.println("Instructor ID: " + rs.getInt(1) + " " + "Instructor Name: " + rs.getString(2) + " "
					+ "Email: " + rs.getString(3));
		}
		return instructors;
	}
}
