package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
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
				
	//			displayCourses();
				
			}else if (userSelection.equals("2")) {
				
			//	viewCourse();
				
			}else if (userSelection.equals("3")) {
				
				// viewStudent();
				
			}else if (userSelection.equals("4")) {
				
			//	viewInstructor();
				
			}else if (userSelection.equals("5")) {
				
			//	addCourse();
				
			}else if (userSelection.equals("6")) {
				
			//	addInstructor();
				
			}else if (userSelection.equals("7")) {
				
			//	addStudent();
				
			}else if (userSelection.equals("8")) {
				
			//	deleteCourse();
				
			}else if (userSelection.equals("9")) {
				
			//	deleteInstructor();
				
			}else if (userSelection.equals("10")) {
				
			//	deleteStudent();
				
			}else if (userSelection.equals("11")) {
				
				//updateCourse();
				
			}else if (userSelection.equals("12")) {
				
				//updateStudent();
				
			}else if (userSelection.equals("13")) {
				
				//updateInstructor();
				
			}else {
				System.out.println("Invalid userSelection, please make a valid userSelection...");
			}
			
			System.out.println("Press enter to continue");
			scan.nextLine();
			
		}while (!userSelection.equals("14"));
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
