package bootEntity;

import java.util.List;

public class instructors {
	private int instructorId;
	private String instructorName;
	private String instructorEmail;
	private List<courses> courses;
	
	public instructors (int instructorId, String instructorName, String instructorEmail, List<courses> courses) {
		this.setInstructorId(instructorId);
		this.setInstructorName(instructorName);
		this.setInstructorEmail(instructorEmail);
		this.setCourses(courses);
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}

	public List<courses> getCourses() {
		return courses;
	}

	public void setCourses(List<courses> courses) {
		this.courses = courses;
	}
}
