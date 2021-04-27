package assignment8_Methods;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
	/*Create a method called "plus", its return is void and it gets no arguments.
	It asks the user to input two numbers, then it will add them and print the result.
	Create a scanner within the plus method.
	Example:
	enter first number:
	1
	enter second number:
	2
	result: 3 */
	plus();
	}
	public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scan.nextInt();
		System.out.println("enter second number");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println(c);
		
	}

}
