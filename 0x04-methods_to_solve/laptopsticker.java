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
        int wc = sc.nextInt();
        int hc = sc.nextInt();
        int ws = sc.nextInt();
        int hs = sc.nextInt();
        
        System.out.println( (wc >= ws && hc >= hs) ? "1" : "0");
    }
}
