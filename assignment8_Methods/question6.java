package assignment8_Methods;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
	/*
	 * 	Create a method called next3 . 
	 * 	This method gets an int argument and prints the next 3 numbers after that number.
	 * 	Call the method from main method and pass num to it.
		enter number
		1
		next 3 are:
		2 3 4
		(put a space between numbers)
	 */
		next3();

	}
	
	public static void next3() {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int number = scan.nextInt();
	System.out.println("next 3 are:");
	System.out.println((number+1) + " " +(number+2) + " " + (number+3));
	
	
	
	}

}
