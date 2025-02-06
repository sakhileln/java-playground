public class CoolPattern {
    public static void main(String[] args) {
        int rows = 10; // Number of rows in the pattern
        int cols = 40; // Width of the wave

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((j + i) % 10 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
