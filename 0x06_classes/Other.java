// What is accessible?
public class Outer {
	private int outerX;

	class Nester1 {
		private int nester1X;
		void show() {
			// t.outerX? u.nester1X? v.nester2X?
		}
	}

	class Nester2 {
		private int nester2X;
		void show() {
			// t.outerX? u.nester1X? v.nester2X?
		}
	}

	void show() {
		// t.outerX? u.nester1X? v.nester2X?
	}
}