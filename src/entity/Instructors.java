package entity;

public class Instructors {
	private int instructor_id;
	private String instructor_name;
	private String instructor_email;

	public Instructors(int instructor_id, String instructor_name, String instructor_email) {
		this.setInstructor_id(instructor_id);
		this.setInstructor_name(instructor_name);
		this.setInstructor_email(instructor_email);
	}

	public int getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}

	public String getInstructor_name() {
		return instructor_name;
	}

	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}

	public String getInstructor_email() {
		return instructor_email;
	}

	public void setInstructor_email(String instructor_email) {
		this.instructor_email = instructor_email;
	}
}
