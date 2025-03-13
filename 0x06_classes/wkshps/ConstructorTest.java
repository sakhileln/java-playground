class ConstructorTest {
    int x;

    ConstructorTest() {
        this(5);
        System.out.println("Default Constructor");
    }

    ConstructorTest(int x) {
        this.x = x;
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        ConstructorTest obj = new ConstructorTest();
    }
}
