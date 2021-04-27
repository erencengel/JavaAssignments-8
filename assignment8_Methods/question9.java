package assignment8_Methods;

public class question9 {

	public static void main(String[] args) {
	/*
	 * 	Create a method called max. It gets two ints, x and max.
		x is the test case, max is what we test against.
		if x is bigger then max return max
		in any other case return x.
		for example:
		max(1,10)
		returns 1
		max(11,5)
		returns 5
	 */
	max(1,10);
	max(11, 5);
	}
	
	public static void max(int x, int max) {
		if(x>max) {
			System.out.println(max);
		}else {
			System.out.println(x);
		}
	}

}
