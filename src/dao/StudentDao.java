package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.ArrayList;
import java.util.List;

import entity.Courses;
import entity.Students;

public class StudentDao {

	private static Connection connection;

	private final String GET_STUDENT_AND_COURSES_ENROLLED_IN_BY_STUDENT_ID_QUERY = "SELECT s.student_id, s.student_name, s.student_email from students s, courses c, course_student cs\r\n"
			+ "WHERE s.student_id = ?\r\n" + "AND cs.student_id = s.student_id\r\n" + "AND c.course_id = cs.course_id";

	private static final String GET_STUDENTS_IN_A_COURSE_QUERY = "SELECT s.student_id, s.student_name, s.student_email from students s, courses c, course_student cs\\r\\n\"\r\n" + 
			"			+ \"WHERE s.student_id = ?\\r\\n\" + \"AND cs.student_id = s.student_id\\r\\n\" + \"AND c.course_id = cs.course_id";
	private final String ADD_NEW_STUDENT_QUERY = "INSERT INTO students (student_name, student_email) VALUES (?,?)";

	private final String DELETE_STUDENT_BY_ID_QUERY = "DELETE from students WHERE student_id = ?";

	private final String UPDATE_STUDENT_BY_ID_QUERY = "UPDATE students SET student_name = ?, student_email = ? WHERE student_id = ?";
	
	private CourseDao courseDao;
	public StudentDao() {
		connection = DBConnection.getConnection();
		courseDao = new CourseDao();
	}

	public Students viewStudent(int studentId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_STUDENT_AND_COURSES_ENROLLED_IN_BY_STUDENT_ID_QUERY);
		ps.setInt(1, studentId);
		ResultSet rs = ps.executeQuery();
		Students student = null;
		List<Courses> courses = new ArrayList<>();
		while (rs.next()) {
			student = new Students(rs.getInt(1), rs.getString(2), rs.getString(3));
			
		}
		courses = courseDao.getCoursesByStudent(studentId);
		student.setCourses(courses);
		return student;

	}
	
	public static List <Students> getStudentInCourse(int courseId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_STUDENTS_IN_A_COURSE_QUERY);
		ps.setInt(1, courseId);
		ResultSet rs = ps.executeQuery();
		List <Students> student = new ArrayList <Students>();
		while (rs.next()){
			student.add(new Students(rs.getInt(1), rs.getString(3), rs.getString(4)));
		
		}return student;
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
