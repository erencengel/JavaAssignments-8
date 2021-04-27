package assignment8_Methods;

public class question13 {

	public static void main(String[] args) {
	/*
	 * 	This method calculates a water bill, the method gets a double and returns a double.
		The more water you use the more it will cost you (as a fine for wasting water).
		for example:
		waterTax(50)
		returns 30
		waterTax(55)
		returns 49.5
		waterTax(101)
		returns 140.9
		waterTax(151)
		returns 235.9
		the regular calculation under 50 is
		bill = units * 0.60;
		above 50 is:
		bill = units * 0.90;
		above 100 the calculation is like above 50 but with a 50 as fine
		and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price.
	 */
		waterTax(50);
		waterTax(55);
		waterTax(101);
		waterTax(151);
	}
	
	public static void waterTax(int unit) {
		double bill=0;
		if(unit<50 || unit==50) {
			bill=unit*0.6;
		}else if (50<unit && unit<100) {
			bill=unit*0.9;
		}else  if(100<=unit && unit<150) {
			bill=unit*0.9+50;
		}else if (unit>150) {
			bill=unit*0.9+100;
		}
		System.out.println(bill);
	}		
	
	

}
