package assignment8_Methods;

public class question14 {

	public static void main(String[] args) {
	/*
	 * 	This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
		It returns true only if both a and b are true or c is true.
	 */
	System.out.println(logic(false, false, true));
	}

	public static boolean logic (boolean a, boolean b, boolean c) {
		if((a && b) || c) {
			return true;
		}else {
			return false;
		}
	
	}
	
}
