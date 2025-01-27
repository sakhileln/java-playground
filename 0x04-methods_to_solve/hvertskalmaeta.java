/**
 * Input consists of a single line containing a single string,
 * the name of the contestant’s municipality in English characters.
 * Output the contest site to which the contestant should attend.
 * Output the name of the municipality in English characters,
 * either Akureyri or Reykjavik.
 */

import java.util.Scanner;

public class hvertskalmaeta {
    public static void main(String[] varg) {
        Scanner sc = new Scanner(System.in);
        String muni = sc.next();
        
        if (muni.equals("Reykjavík")) System.out.println("Reykjavík");
        else if (muni.equals("Kopavogur")) System.out.println("Reykjavík");
        else if (muni.equals("Hafnarfjordur")) System.out.println("Reykjavík");
        else if (muni.equals("Reykjanesbaer")) System.out.println("Reykjavík");
        else if (muni.equals("Akureyri")) System.out.println("Akureyri");
        else if (muni.equals("Gardabaer")) System.out.println("Reykjavík");
        else if (muni.equals("Mosfellsbaer")) System.out.println("Reykjavík");
        else if (muni.equals("Árborg")) System.out.println("Reykjavík");
        else if (muni.equals("Akranes")) System.out.println("Reykjavík");
        else if (muni.equals("Fjardabyggd")) System.out.println("Akureyri");
        else if (muni.equals("Mulathing")) System.out.println("Akureyri");
        else if (muni.equals("Seltjarnarnes")) System.out.println("Reykjavík");
        
        sc.close();
    }
}
