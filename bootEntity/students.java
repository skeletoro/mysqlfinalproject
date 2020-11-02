package bootEntity;

import java.util.List;

public class students {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private List<courseStudent> courseStudent;
	
	public students (int studentId, String studentName, String studentEmail, List<courseStudent> courseStudent) {
		this.setStudentId(studentId);
		this.setStudentName(studentName);
		this.setStudentEmail(studentEmail);
		this.setCourseStudent(courseStudent);
}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public List<courseStudent> getCourseStudent() {
		return courseStudent;
	}

	public void setCourseStudent(List<courseStudent> courseStudent) {
		this.courseStudent = courseStudent;
	}
}
