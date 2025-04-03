import java.util.Scanner;

public class in {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int a;
    while (true) {
      try {
        a = Integer.parseInt(sc.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Please enter a number: "+ e);
      }
    }

    sc.close();
  }
}
