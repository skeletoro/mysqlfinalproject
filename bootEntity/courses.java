package bootEntity;

import java.util.List;

public class courses {
	private int courseId;
	private String courseName;
	private String format;
	private String semester;
	private List<courseStudent> courseStudent;
	
	public courses (int courseId, String courseName, String format, String semester, List<courseStudent> courseStudent) {
		this.setCourseId(courseId);
		this.setCourseName(courseName);
		this.setFormat(format);
		this.setSemester(semester);
		this.setCourseStudent(courseStudent);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public List<courseStudent> getCourseStudent() {
		return courseStudent;
	}

	public void setCourseStudent(List<courseStudent> courseStudent) {
		this.courseStudent = courseStudent;
	}
}
