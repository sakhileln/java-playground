/**
 * The first line of input contains a positive integer n, the number of meat
 * types KFFÍ is offering today. Next lines will follow, each one with a unique
 * meat type. The meat type is either "nautakjot" or "kjuklingur".The first 
 * line of input contains a positive integer , the number of meat types KFFÍ 
 * is offering today. Next lines will follow, each one with a unique meat type.
 * The meat type is either "nautakjot" or "kjuklingur".The first line of input 
 * contains a positive integer , the number of meat types KFFÍ is offering today.
 * Next lines will follow, each one with a unique meat type. The meat type is
 * either "nautakjot" or "kjuklingur".
 */

import java.util.Scanner;

public class blandadbest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] meat = new String[n];
        for (short i = 0; i < n; i++) {
            meat[i] = sc.next();
        }
        
        short counter = 0;
        short counter2 = 0;
        for (String s : meat) {
            if (s.equals("nautakjot")) counter++;
            else if (s.equals("kjuklingur")) counter2++;
        }
        
        if ((counter+counter2) >= 2) System.out.println("blandad best");
        else if (counter == 1) System.out.println("nautakjot");
        else if (counter2 == 1) System.out.println("kjuklingur");
        
        sc.close();
    }
}
