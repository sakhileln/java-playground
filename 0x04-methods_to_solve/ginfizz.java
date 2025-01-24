import java.util.Scanner;

/**
 * Input
 * The number N, of Gin Fizzes you want to prepare, where 1 <= N <= 10.
 * Output
 * Print the total ingredients you need for
 * Gin Fizzes, in the order given by the recipe, as shown in the sample outputs.
 * Liquid amounts are given in millilitres.
 */

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
