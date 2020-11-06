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
	private List<String> uOptions = Arrays.asList(
			"Display all courses",
			"View a specific course and Students enrolled",
			"View a specific Student and course presently enrolled in",
			"View courses by Instructor",
			"Add a new course to the system",
			"Add a new Instructor to the system",
			"Add a new Student to the system",
			"Delete a course from the system",
			"Delete an Instructor from the system",
			"Delete a Student from the system",
			"Update an existing course",
			"Update an existing Course",
			"Update an existing Instructor" );
	
	
	public void start() {
		String userSelection = "";
		
		do {
			printFullMenu();
			userSelection = scan.nextLine();
			
			if (userSelection.equals("1")) {
				
			displayCourses();
				
			}else if (userSelection.equals("2")) {
				
			viewCourse();
				
			}else if (userSelection.equals("3")) {
				
			viewStudent();
				
			}else if (userSelection.equals("4")) {
				
				getCoursesByInstructor();
				
			}else if (userSelection.equals("5")) {
				
			addCourse();
				
			}else if (userSelection.equals("6")) {
				
				addInstructor();
				
			}else if (userSelection.equals("7")) {
				
			addStudent();
				
			}else if (userSelection.equals("8")) {
				
			deleteCourse();
				
			}else if (userSelection.equals("9")) {
				
				deleteInstructor();
				
			}else if (userSelection.equals("10")) {
				
				deleteStudent();
				
			}else if (userSelection.equals("11")) {
				
				updateCourse();
				
			}else if (userSelection.equals("12")) {
				
				updateStudent();
				
			}else if (userSelection.equals("13")) {
				
				updateInstructor();
				
			}else {
				System.out.println("Invalid userSelection, please make a valid userSelection...");
			}
			
			System.out.println("Press enter to continue");
			scan.nextLine();
			
		}while (!userSelection.equals("14"));
	}

 private void updateInstructor() {
		// TODO Auto-generated method stub
		
	}

private void updateStudent() {
		// TODO Auto-generated method stub
		
	}

private void updateCourse() {
		// TODO Auto-generated method stub
		
	}

private void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

private void deleteInstructor() {
		// TODO Auto-generated method stub
		
	}

private void deleteCourse() {
		// TODO Auto-generated method stu
		
	}

private void addStudent() {
	System.out.println("to add student please enter the name of student to add and presss enter");
	String name = scan.next();
	System.out.println("please add the email associated with the student and press enter");
	String email = scan.next();
	try {
		studentdao.addStudent(name,email);
		System.out.println("Student has been added successfully!");
	} catch (SQLException e) {
		System.out.println("error occured in addStudent method");
		e.printStackTrace();
	}
	}

private void addInstructor() {
		System.out.println("to add an Instructor please enter the full name for the Instructor and press enter");
		String name = scan.next();
		System.out.println("please add the email for the instructor to be added and press enter");
		String email = scan.next();
		try {
			instructordao.addInstructor(name, email);
			System.out.println("Instructor has been added succesfully!");
		} catch (SQLException e) {
			System.out.println("error occurred in add instructor");
			e.printStackTrace();
		}
		
		
	}

private void addCourse()  {
System.out.println("to add a Course please enter the Instructor ID to assign teacher to program and press enter ");
int id = scan.nextInt();
System.out.println("Please add the name of the Course and press enter");
String name = scan.next();
System.out.println("please enter the format of the Course and press enter");
String format = scan.next();
System.out.println("please enter the semester of the Course and press enter");
String semester = scan.next();
try {
	coursedao.addCourse(id, name, format, semester);
	System.out.println("Course added successfully!");
} catch (SQLException e) {
	
	System.out.println("error occurred in addCourse");
	e.printStackTrace();
}
	}

private void getCoursesByInstructor() {
		// TODO Auto-generated method stub
		
	}

private void viewStudent() {
		// TODO Auto-generated method stub
		
	}

private void viewCourse() {
		// TODO Auto-generated method stub
		
	}

private void displayCourses() {
		// TODO Auto-generated method stub
		
	}

private void printFullMenu() {
	 System.out.println("Select an option to continue: \n___________________________");
	 for (int x = 0; x < uOptions.size(); x++) {
		 System.out.println(x + 1 + ") " + uOptions.get(x));
	 }
	 
 }

	
	//private void displayCourses() {
		//List <Courses> courses = courseDao.getCourses();
		//for (Course course:courses) {
		//	System.out.println(course.getCourseID() + " "  );
		//}

	}

//}
