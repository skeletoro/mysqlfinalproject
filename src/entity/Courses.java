package entity;

import java.util.List;

public class Courses {
	private int course_id;

	private String course_name;
	private String format;
	private String semester;

	private List<Students> student;

	public Courses(int course_id, String course_name, String format, String semester) {
		this.setCourse_id(course_id);

		this.setCourse_name(course_name);
		this.setFormat(format);
		this.setSemester(semester);
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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

	public List<Students> getStudent() {
		return student;
	}

	public void setStudent(List<Students> student) {
		this.student = student;
	}

}
