package oopsconcept;

import java.util.Scanner;

public class Abstration {
	public class AdditionScanner {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        // Ask user for input
	        System.out.print("Enter first number: ");
	        int a = s.nextInt();

	        System.out.print("Enter second number: ");
	        int b = s.nextInt();

	        int c = a + b;

	        // Display result
	        System.out.println("The sum of " + a + " and " + b + " is: " + c);

	        s.close(); // Always close the scanner
	    }
	}


}
