public class NegativeZero {
    public static void main(String[] args) {
        double negZero = -0.0;
        System.out.println(negZero == 0.0); // true
        System.out.println(1.0 / negZero);  // -Infinity
    }
}
