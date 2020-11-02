package dao;

import java.sql.ResultSet;

public class courseDao {
	
	private final String GET_COURSES_QUERY = "SELECT c.course_id, c.course_name, c.format, c.semester, i.instructor_name FROM courses c, instructors i WHERE c.instructor_id = i.instructor_id";

	
	
	public List <Courses> getCourses() {
		ResultSet rs = connection.prepareStatement(GET_COURSES_QUERY).executeQuery();
		List <Courses> courses = newArrayList <Courses>();
		while rs.next()){
			//I don't completely understand what Nick did here...but the idea is the results here get fed into display courses method in menu
		}
		return courses;
		}
	}
}
