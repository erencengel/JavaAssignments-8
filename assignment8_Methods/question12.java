package assignment8_Methods;

public class question12 {

	public static void main(String[] args) {
	/*
	 * 	The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
		the hamletQuote method only returns true if one of or both of the boolean parameters is true.
		example:
		hamletQuote(true, false)
		returns true
		hamletQuote(false,true)
		returns true
		hamletQuote(true,true)
		returns true
		hamletQuote(false,false)
		returns false
	 */
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(false, false));
		
	}

	public static boolean hamletQuote(boolean ans1, boolean ans2) {
		if(ans1==true || ans2==true) {
			return true;
		}else {
			return false;
		}
	}
}
