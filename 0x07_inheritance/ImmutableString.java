public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat(" World"); // This creates a new String but doesn't change s1
        System.out.println(s1); // Hello (not modified!)
    }
}
