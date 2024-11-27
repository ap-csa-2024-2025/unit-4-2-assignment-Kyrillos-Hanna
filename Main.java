import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    oddBetweenTwo(num1, num2);

    System.out.println("Enter a positive integer: ");
    int num3 = sc.nextInt();
    placeValue(num3);
  }

  public static void oddBetweenTwo(int num1, int num2) {
    while (num1 <= num2) {
      if (num1 % 2 == 1) {
        System.out.print(num1 + " ");
      }
      num1++;
    }
    System.out.println();
  }

  public static void placeValue(int num) {
    int deg = 0;
    while (num > 0) {
      int digit = num % 10;
      num /= 10;

      double placeValue = Math.pow(10, deg);
      System.out.println((int) (digit * placeValue));
      deg++;
    }
  }
}
