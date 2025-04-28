// File: other/TryThis.java
package scr;
class DoThat {
}

package other;
public class TryThis {
}

// End of file: other/TryThis.java


// File: scr/TryThis.java
package scr;
public class DoThat {
}

public class TryThis {
}

// End of file: scr/TryThis.java


// What happens?
public class TryThis {
	static { System.out.println("Hello"); }
	{ System.out.println("Hello"); }

	static class A { }
	class B { }

	static enum X { }
	static interface Y { }
}

// How should you instantiate the Nested class
class Other {
	static class Nested { }
}