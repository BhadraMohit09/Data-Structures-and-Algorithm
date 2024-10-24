
import java.util.Scanner;

public class Program5_FactorialUsingRecursion {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of " + num + " is: " + factorial(num));
    }
}
