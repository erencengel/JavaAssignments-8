package assignment8_Methods;

public class question10 {

	public static void main(String[] args) {
	/*
	 * 	isEven method gets a number(int) if its even (2,4,8...) returns true.
		if its odd return false.
		for example:
		isEven(1) --> false
		isEven(8) --> true
	 */
		
		System.out.println(isEven(1));
		System.out.println(isEven(8));

	}
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
