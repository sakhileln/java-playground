import java.util.Scanner;

public class ginfizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        
        short gin = 45;
        short lemon = 30;
        short syrup = 10;
        short slice = 1;
        String sl = "slice";
        slice *= n;
        if (slice > 1) sl = "slices"; 
        
        System.out.println(gin*n + " ml gin");
        System.out.println(lemon*n + " ml fresh lemon juice");
        System.out.println(syrup*n + " ml simple syrup");
        System.out.println(slice + " " + sl + " of lemon");
    }
}
