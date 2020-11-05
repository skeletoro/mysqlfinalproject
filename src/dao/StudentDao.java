package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
<<<<<<< HEAD

import entity.Students;
=======
>>>>>>> 57f756e86493f319e26a5139bc596be800a12975

public class StudentDao {
	
	private Connection connection;

	private final String GET_STUDENT_AND_COURSES_ENROLLED_IN_BY_STUDENT_ID_QUERY = "SELECT s.student_name, s.student_id, s.student_email, c.course_name from students s, courses c, course_student cs\r\n"
			+ "WHERE s.student_id = ?\r\n" + "AND cs.student_id = s.student_id\r\n" + "AND c.course_id = cs.course_id";

	private final String ADD_NEW_STUDENT_QUERY = "INSERT INTO students (student_name, student_email) VALUES (?,?)";

	private final String DELETE_STUDENT_BY_ID_QUERY = "DELETE from students WHERE student_id = ?";

	private final String UPDATE_STUDENT_BY_ID_QUERY = "UPDATE students SET student_name = ?, student_email = ? WHERE student_id = ?";

	public StudentDao() {
		connection = DBConnection.getConnection();
	}
	
	public void viewStudent(int studentId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_STUDENT_AND_COURSES_ENROLLED_IN_BY_STUDENT_ID_QUERY);
		ps.setInt(1, studentId);
		ps.executeQuery();
	}
	
	public void addStudent(String studentName, String studentEmail) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(ADD_NEW_STUDENT_QUERY);
		ps.setString(1, studentName);
		ps.setString(2, studentEmail);
		ps.executeUpdate();
	}

	public void deleteStudent(int studentId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_STUDENT_BY_ID_QUERY);
		ps.setInt(1, studentId);
		ps.executeUpdate();
	}

	public void updateStudent(String studentName, String studentEmail, int studentId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_STUDENT_BY_ID_QUERY);
		ps.setString(1, studentName);
		ps.setString(2, studentEmail);
		ps.setInt(3, studentId);
		ps.executeUpdate();

	}
}
