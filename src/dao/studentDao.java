package dao;

public class studentDao {
	

	
	private final String GET_STUDENT_AND_COURSES_ENROLLED_IN_BY_STUDENT_ID_QUERY = "SELECT s.student_name, s.student_id, s.student_email, c.course_name from students s, courses c, course_student cs\r\n" + 
			"WHERE s.student_id = ?\r\n" + 
			"AND cs.student_id = s.student_id\r\n" + 
			"AND c.course_id = cs.course_id";
	
	private final String ADD_NEW_STUDENT_QUERY = "INSERT INTO students (student_name, student_email) VALUES (?,?)";
	
	private final String DELETE_STUDENT_BY_ID_QUERY = "DELETE from students WHERE student_id = ?";
	
	private final String UPDATE_STUDENT_BY_ID_QUERY = "UPDATE students SET student_name = ?, student_email = ? WHERE student_id = ?";


}
