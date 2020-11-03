package entity;

public class course {
private int course_id;
private int instructor_id;
private String course_name;
private String format ;
private String semester;
public course (int course_id, int instructor_id, String course_name, String format, String semester) {
	this.setCourse_id(course_id);
	this.setInstructor_id(instructor_id);
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
public int getInstructor_id() {
	return instructor_id;
}
public void setInstructor_id(int instructor_id) {
	this.instructor_id = instructor_id;
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
}
