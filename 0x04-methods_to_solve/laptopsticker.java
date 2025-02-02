/**
 * The single line of input contains four integers wc, hc, ws and hs
 * (1 <= wc,hc,ws,hs), where wc is the width of your new laptop computer,
 * hc is the height of your new laptop computer, ws is the width of the 
 * laptop sticker, hs and is the height of the laptop sticker. 
 * All measurements are in centimeters.
 */

import java.util.Scanner;

public class laptopsticker {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int wc = sc.nextInt(); // Laptop Width
        int hc = sc.nextInt() // Laptop height
        int ws = sc.nextInt(); // Sticker width 
        int hs = sc.nextInt(); // sticker Heightc
        
        int requiredWidth = ws + 2; 
        int requiredHeight = hs + 2;

        if (wc >= requiredWidth && hc >= requiredHeight) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
