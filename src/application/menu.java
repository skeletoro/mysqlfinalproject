package application;

import java.util.Scanner;

public class menu {
	Scanner scan = new Scanner(System.in);
	
	public void start() {
		String userSelection = "";
		
		do {
			showMenu();
			selection = scanner.nextLine();
			
			if (selection.equals("1")) {
				
				displayCourses();
				
			}else if (selection.equals("2")) {
				
				viewCourse();
				
			}else if (selection.equals("3")) {
				
				viewStudent();
				
			}else if (selection.equals("4")) {
				
				viewInstructor();
				
			}else if (selection.equals("5")) {
				
				addCourse();
				
			}else if (selection.equals("6")) {
				
				addInstructor();
				
			}else if (selection.equals("7")) {
				
				addStudent();
				
			}else if (selection.equals("8")) {
				
				deleteCourse();
				
			}else if (selection.equals("9")) {
				
				deleteInstructor();
				
			}else if (selection.equals("10")) {
				
				deleteStudent();
				
			}else if (selection.equals("11")) {
				
				updateCourse();
				
			}else if (selection.equals("12")) {
				
				updateStudent();
				
			}else if (selection.equals("13")) {
				
				updateInstructor();
				
			}else {
				System.out.println("please make a valid selection");
			}
			
			System.out.println("Press enter to continue");
			scan.nextLine();
			
		}while (!selection.equals("14"))
	}

}
