package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Courses;

public class CourseDao {
	
	private Connection connection;
	private final String GET_COURSES_QUERY = "SELECT c.course_id, c.course_name, c.format, c.semester, i.instructor_name FROM courses c, instructors i WHERE c.instructor_id = i.instructor_id";

	private final String GET_STUDENTS_IN_A_COURSE_QUERY = "SELECT c.course_name, s.student_name from students s, courses c, course_student cs\r\n"
			+ "WHERE c.course_id = ?\r\n" + "AND cs.student_id = s.student_id\r\n" + "AND c.course_id = cs.course_id";

	private final String GET_COURSES_BY_INSTRUCTOR_ID_QUERY = "SELECT i.instructor_name, i.instructor_id, i.instructor_email, c.course_name\r\n"
			+ "FROM courses c, instructors i\r\n" + "WHERE i.instructor_id = ?\r\n"
			+ "AND c.instructor_id = i.instructor_id";

	private final String ADD_A_NEW_COURSE_QUERY = "INSERT INTO courses (instructor_id, course_name, course_format, semester) VALUES (?,?,?,?)";

	private final String DELETE_COURSE_BY_ID_QUERY = "DELETE from courses WHERE course_id = ?";

	private final String UPDATE_COURSE_BY_ID_QUERY = "UPDATE courses SET instructor_id = ?, course_name = ?, format = ?, semester = ? WHERE course_id = ?";

	
	public CourseDao() {
		connection = DBConnection.getConnection();
	}
	
	
	public List <Courses> getCoursesByStudent(int studentId) {
		PreparedStatement ps = connection.prepareStatement(GET_COURSES_QUERY);
		ps.setInt(1, studentId);
		ResultSet rs = ps.executeQuery();
		List <Courses> courses = new ArrayList <Courses>();
		while (rs.next()){
			courses.add(new Courses(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		return courses;
		}
	
	public void viewCourse
	
	public void viewInstructor

	public void addCourse(int instructorId, String courseName, String format, String semester) {
		PreparedStatement ps = connection.prepareStatement(ADD_A_NEW_COURSE_QUERY);
		ps.setInt(1, instructorId);
		ps.setString(2, courseName);
		ps.setString(3, format);
		ps.setString(4, semester);
		ps.executeUpdate();
	}

	public void deleteCourse(int courseId) {
		PreparedStatement ps = connection.prepareStatement(DELETE_COURSE_BY_ID_QUERY);
		ps.setInt(1, courseId);
		ps.executeUpdate();
	}

	public void updateCourse(int instructorId, String courseName, String format, int courseId) {
		PreparedStatement ps = connection.prepareStatement(UPDATE_COURSE_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.setString(2, courseName);
		ps.setString(3, format);
		ps.setInt(4, courseId);
		ps.executeUpdate();

	}
}
