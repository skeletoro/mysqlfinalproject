package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import entity.Courses;

public class CourseDao {

	private Connection connection;

	private String DISPLAY_COURSE_QUERY = "SELECT * from courses";

	private final String GET_COURSES_BY_INSTRUCTOR_ID_QUERY = "SELECT c.course_id, c.course_name, c.format, c.semester FROM courses c, instructors i WHERE i.instructor_id = ? AND c.instructor_id = i.instructor_id";

	private final String ADD_A_NEW_COURSE_QUERY = "INSERT INTO courses (instructor_id, course_name, format, semester) VALUES (?,?,?,?)";

	private final String DELETE_COURSE_BY_ID_QUERY = "DELETE from courses WHERE course_id = ?";

	private final String UPDATE_COURSE_BY_ID_QUERY = "UPDATE courses SET instructor_id = ?, course_name = ?, format = ?, semester = ? WHERE course_id = ?";

	public CourseDao() {
		connection = DBConnection.getConnection();
	}

	public List<Courses> getCoursesByInstructor(int instructorId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_COURSES_BY_INSTRUCTOR_ID_QUERY);
		ps.setInt(1, instructorId);
		ResultSet rs = ps.executeQuery();
		List<Courses> courses = new ArrayList<Courses>();
		while (rs.next()) {
			courses.add(new Courses(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));

		}
		return courses;
	}

	public void addCourse(int instructorId, String courseName, String format, String semester) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(ADD_A_NEW_COURSE_QUERY);
		ps.setInt(1, instructorId);
		ps.setString(2, courseName);
		ps.setString(3, format);
		ps.setString(4, semester);
		ps.executeUpdate();
	}

	public void deleteCourse(int courseId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_COURSE_BY_ID_QUERY);
		ps.setInt(1, courseId);
		ps.executeUpdate();
	}

	public void updateCourse(int instructorId, String courseName, String format, String semester, int courseId)
			throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_COURSE_BY_ID_QUERY);
		ps.setInt(1, instructorId);
		ps.setString(2, courseName);
		ps.setString(3, format);
		ps.setString(4, semester);
		ps.setInt(5, courseId);
		ps.executeUpdate();

	}

	public List<Courses> displayCourses() throws SQLException {
		ResultSet rs = connection.prepareStatement(DISPLAY_COURSE_QUERY).executeQuery();
		List<Courses> courses = new ArrayList<Courses>();
		while (rs.next()) {
			System.out.println("Course ID: " + rs.getInt(1) + " " + "Instructor ID: " + rs.getInt(2) + " "
					+ "Course Name: " + rs.getString(3) + " " + "Format: " + rs.getString(4) + " " + "Semester: "
					+ rs.getString(5));
		}
		return courses;
	}

}
