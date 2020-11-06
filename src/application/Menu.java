package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.CourseDao;
import dao.InstructorDao;
import dao.StudentDao;

public class Menu {
	StudentDao studentdao = new StudentDao();
	InstructorDao instructordao = new InstructorDao();
	CourseDao coursedao = new CourseDao();
	private Scanner scan = new Scanner(System.in);
	private List<String> uOptions = Arrays.asList("Display all courses", "View a specific course and students enrolled",
			"View a specific student and courses presently enrolled in", "View courses by instructor",
			"Add a new course to the system", "Add a new instructor to the system", "Add a new student to the system",
			"Delete a course from the system", "Delete an instructor from the system",
			"Delete a student from the system", "Update an existing course", "Update an existing course",
			"Update an existing instructor");

	public void start() throws SQLException {
		String userSelection = "";

		do {
			printFullMenu();
			userSelection = scan.nextLine();
			
			if (userSelection.equals("1")) {

				displayCourses();

			} else if (userSelection.equals("2")) {

				viewCourse();

			} else if (userSelection.equals("3")) {

				viewStudent();

			} else if (userSelection.equals("4")) {

				getCoursesByInstructor();

			} else if (userSelection.equals("5")) {

				addCourse();

			} else if (userSelection.equals("6")) {

				addInstructor();

			} else if (userSelection.equals("7")) {

				addStudent();

			} else if (userSelection.equals("8")) {

				deleteCourse();

			} else if (userSelection.equals("9")) {

				deleteInstructor();

			} else if (userSelection.equals("10")) {

				deleteStudent();

			} else if (userSelection.equals("11")) {

				updateCourse();

			} else if (userSelection.equals("12")) {

				updateStudent();

			} else if (userSelection.equals("13")) {

				updateInstructor();

			} else {
				System.out.println("Invalid userSelection, please make a valid userSelection...");
			}
			System.out.println("Press enter to continue");
			scan.nextLine();

		} while (!userSelection.equals("14"));
	}

	private void printFullMenu() {
		System.out.println("Select an option to continue: \n___________________________");
		for (int x = 0; x < uOptions.size(); x++) {
			System.out.println(x + 1 + ") " + uOptions.get(x));
		}
	}

	private void updateInstructor() {

		System.out.println("Please enter the new name for the instructor being updated and hit enter:");
		String name = scan.next();
		System.out.println("Please enter the current email for the instructor being updated:");
		String email = scan.next();
		System.out.println("Please enter the Instructor ID for the person you would like to update and press enter");
		int id = scan.nextInt();
		try {
			instructordao.updateInstructor(name, email, id);
			System.out.println("Instructor has been updated successfully");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to update instructor.");
			e.printStackTrace();
		}

	}

	private void updateStudent() {

		System.out.println("Please enter the new name for the student being updated and hit enter:");
		String name = scan.next();
		System.out.println("Please enter the current email for the student being updated:");
		String email = scan.next();
		System.out.println("Please enter the Student ID for the person you would like to update and press enter:");
		int id = scan.nextInt();
		try {
			instructordao.updateInstructor(name, email, id);
			System.out.println("Student has been updated successfully.");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to update student.");
			e.printStackTrace();
		}

	}

	private void updateCourse() {
		System.out.println("Please enter the ID for the instructor teaching the course and hit enter:");
		int instid = scan.nextInt();
		System.out.println("Please enter the new name for the course being updated and hit enter:");
		String name = scan.next();
		System.out.println("Please enter the format for the course being updated:");
		String format = scan.next();
		System.out.println("Please enter the semester for the course you would like to update and press enter:");
		String semester = scan.next();
		System.out.println("Please enter the course ID for the courses being updated and hit enter:");
		int cid = scan.nextInt();
		try {
			coursedao.updateCourse(instid, name, format, cid);
			System.out.println("Course updated successfully!");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to update course.");
			e.printStackTrace();
		}
	}

	private void deleteStudent() {
		System.out.println("To delete student, please enter student ID and press enter:");
		int id = scan.nextInt();
		try {
			studentdao.deleteStudent(id);
			System.out.println("Student has been deleted succesfully.");
		} catch (SQLException e) {
			System.out.println("Error when attempting to delete student.");
			e.printStackTrace();
		}

	}

	private void deleteInstructor() {
		System.out.println("To delete instructor please enter their instructor ID and press enter:");
		int id = scan.nextInt();
		try {
			instructordao.deleteInstructor(id);
			System.out.println("Instructor deleted successfully.");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to delete instructor.");
			e.printStackTrace();
		}

	}

	private void deleteCourse() {
		System.out.println("Please enter the course ID and press enter to delete it:");
		int id = scan.nextInt();
		try {
			coursedao.deleteCourse(id);
			System.out.println("Course deleted successfully!");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to delete course.");
			e.printStackTrace();
		}

	}

	private void addStudent() {
		System.out.println("To add student please enter the name of student to add and presss enter:");
		String name = scan.next();
		System.out.println("Please add the email associated with the student and press enter:");
		String email = scan.next();
		try {
			studentdao.addStudent(name, email);
			System.out.println("Student has been added successfully!");
		} catch (SQLException e) {
			System.out.println("Error occured when  attempting to add student.");
			e.printStackTrace();
		}
	}

	private void addInstructor() {
		System.out.println("To add an Instructor please enter the full name for the instructor and press enter:");
		String name = scan.next();
		System.out.println("Please add the email for the instructor to be added and press enter:");
		String email = scan.next();
		try {
			instructordao.addInstructor(name, email);
			System.out.println("Instructor has been added succesfully!");
		} catch (SQLException e) {
			System.out.println("Error occurred when attempting to add instructor.");
			e.printStackTrace();
		}

	}

	private void addCourse() {
		System.out.println(
				"To add a Course please enter the instructor ID to assign teacher to program and press enter:");
		int id = scan.nextInt();
		System.out.println("Please add the name of the course and press enter:");
		scan.next();
		String name = scan.nextLine();
		System.out.println("Please enter the format of the course and press enter:");
		String format = scan.next();
		System.out.println("Please enter the semester of the course and press enter:");
		String semester = scan.next();
		try {
			coursedao.addCourse(id, name, format, semester);
			System.out.println("Course added successfully!");
		} catch (SQLException e) {

			System.out.println("Error occurred when attempting to add course.");
			e.printStackTrace();
		}
	}

	private void getCoursesByInstructor() {
		System.out.println("To view the course by instructor enter the ID for the instructor and press enter:");
		int id = scan.nextInt();
		instructordao.getCoursesByInstructor();
	}

	private void viewStudent() {
		System.out.println("Please enter the student Id to view individual records and press enter:");
		int id = scan.nextInt();
		try {
			studentdao.viewStudent(id);

		} catch (SQLException e) {
			System.out.println("There was an error in attempting to retrieve student information.");
			e.printStackTrace();
		}
	}

	private void viewCourse() throws SQLException {
		System.out.println("Please enter the course ID for the course and press enter to view information:");
		int courseId = scan.nextInt();
		coursedao.viewCourse(courseId);
	}

	private void displayCourses() {
		coursedao.displayCourses();

	}

	
	}


