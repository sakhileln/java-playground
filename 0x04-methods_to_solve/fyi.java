import java.util.Scanner;
public class fyi {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        byte count = 0;
        for (short i =0; i<number.length(); i++) {
            if (number.charAt(i) == '5') count++;
        }
        if (count >= 3) System.out.println("1");
        else System.out.println("0");
        sc.close();
    }
}
