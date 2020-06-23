package InputName;

import java.util.Scanner;

public class InputName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name?");
		String myName = scan.nextLine();
		
		System.out.println("Hello " + myName);
	}

}
