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

