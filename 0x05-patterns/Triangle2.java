public class Triangle2 {
  public static void main(String[] args) {
    int n = 5; // Number of rows

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

