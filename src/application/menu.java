package application;

import java.util.Scanner;

public class menu {
	Scanner scan = new Scanner(System.in);
	
	public void start() {
		String userSelection = "";
		
		do {
			showMenu();
			selection = scanner.nextLine();
			
			
		}while (!selection.equals("14"))
	}

}
