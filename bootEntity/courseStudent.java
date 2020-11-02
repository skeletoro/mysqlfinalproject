package bootEntity;

public class courseStudent {
	private int courseId;
	private int studentId;
	
	public courseStudent (int courseId, int studentId) {
		this.setCourseId(courseId);
		this.setStudentId(studentId);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
