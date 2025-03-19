public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Java")); // Output: "avaJ"
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; // Creates new string each time (not optimal!)
        }
        return reversed;
    }
}
