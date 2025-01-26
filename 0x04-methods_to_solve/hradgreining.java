/**
 * A single line containing the DNA string.
 * If the DNA string contains the substring COV 
 * then print Veikur!, otherwise print Ekki veikur!.
 */

import java.util.Scanner;


public class hradgreining {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        String dnaString = scObj.next();
        System.out.println(dnaString.contains("COV") ? "Veikur!" : "Ekki veikur!");
        scObj.close();
    }
}
