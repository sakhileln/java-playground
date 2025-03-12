public class Light {
	// Fields:
	int noOfWatts;		// Wattage
	boolean indicator;	// On or Off
	String location;	// Placement

	// Constructor:
	public Light(int noOfWatts, boolean indicator, String site) {
		String location;

		this.noOfWatts = noOfWatts;		// Assignment to field
		indicator = indicator;			// Assignement to paramerter
		location = site;				// Assignment to local variable
		this.superfluous();
		superfluous();					// Equivalent to previous call
	}

	// Instance method:
	public void superfluous() {
		System.out.printf("Current object: %s%n", this);
	}

	// Static method:
	public static void main(String[] args) {
		Light light = new Light(100, true, "loft");
		System.out.println("No. of watts: " + light.noOfWatts);
		System.out.println("Indicator: " + light.indicator);
		System.out.println("Location: " + light.location);
	}
}