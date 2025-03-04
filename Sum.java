/**
 * Write a method with one int parameter called number
 * If parameter is greater >= 10 method should process the number and 
 * return sum of all digits, otherwise return -1 for invalid values.
 * Numbers 0-9 have one digit so we dont want to process them and negative numbers.
 * When method is called sumDigits(125) should be 8 since 1 + 2 + 5 = 8. 
 */

public class Sum {
  private static int sumDigits(int number) {
    int sum = 0;
    if (number <= 9) {
      return -1;
    }
    else {
      while (number != 0) {
        sum += number % 10;
        number /= 10;
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumDigits(32123));
  }

}
