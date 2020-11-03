package dao;

public class instructorDao {
	
	private final String ADD_NEW_INSTRUCTOR_QUERY = "INSERT INTO instructors (instructor_name, instructor_email) VALUES (?,?)";
	
	private final String DELETE_INSTRUCTOR_BY_ID_QUERY = "DELETE from instructors WHERE instructor_id = ?";
	
	private final String UPDATE_INSTRUCTOR_BY_ID_QUERY = "UPDATE instructors SET instructor_name = ?, instructor_email = ? WHERE instructor_id = ?";

	
}
