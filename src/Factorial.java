import java.util.Scanner;

public class Factorial {
   //This program to find a factorial for given number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(To find Factorial)\nEnter any number:");
        int a = scan.nextInt();// to input
        int factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println("Given number is "+a);
        System.out.println("Factorial is "+factorial);

    }
}
