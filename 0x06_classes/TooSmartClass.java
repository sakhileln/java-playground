public class TooSmartClass {
	public static void main(String[] args) {
		double weight = 10.0, thePrice;  		// Local variables

		if (weight < 10.0) thePrice = 20.50; 	
		if (weight > 50.0) thePrice = 399.99;
		if (weight >= 10.0) thePrice = weight * 10.0; 	// Always executed
		System.out.println("The price is: " + thePrice);	// Compile-time error
	}
}