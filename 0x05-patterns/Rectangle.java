public class Rectangle {
  public static void main(String[] args) {
    int rows = 5; // Number of rows
    int cols = 10; // Number of columns

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

