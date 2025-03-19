public class StringPoolTest {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");
        String c = b.intern();

        System.out.println(a == b);  // false (b is a new object)
        System.out.println(a == c);  // true (c refers to the pooled string)
    }
}
