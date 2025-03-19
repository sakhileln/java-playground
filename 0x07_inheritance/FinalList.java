import java.util.ArrayList;
import java.util.List;

public class FinalList {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("Java"); // Allowed!
        System.out.println(list); // [Java]
        
        // list = new ArrayList<>(); // Compilation Error! (final reference)
    }
}
