package entity;

public class student {
	private int  student_id;
	private String student_name;
	private String student_email;
	
public student(int student_id, String student_name, String student_email) {
	this.setStudent_id(student_id);
	this.setStudent_name(student_name);
	this.setStudent_email(student_email);
}

public int getStudent_id() {
	return student_id;
}

public void setStudent_id(int student_id) {
	this.student_id = student_id;
}

public String getStudent_name() {
	return student_name;
}

public void setStudent_name(String student_name) {
	this.student_name = student_name;
}

public String getStudent_email() {
	return student_email;
}

public void setStudent_email(String student_email) {
	this.student_email = student_email;
}
}
