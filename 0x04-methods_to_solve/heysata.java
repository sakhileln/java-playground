/**
 * The first line contains the integer n, the number of characters in the hay stack.
 * The second line contains the character k, the needle Unnar should find, it can be 
 * a lower case or upper case letter. The third and last line contains a string of 
 * length n, the haystack that Unnar should search through. The letters can be upper 
 * case or lower case letters, there are no spaces in the string.
 */

import java.util.Scanner;


public class heysata {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int n = scObj.nextInt();
        scObj.nextLine();
        
        char k = scObj.next().charAt(0);
        String hay = scObj.next();
        
        System.out.println(hay.indexOf(String.valueOf(k)) != -1 ? "Unnar fann hana!" : "Unnar fann hana ekki!");
        
        scObj.close();
    }
}

