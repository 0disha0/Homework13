import java.util.Scanner;

public class FirstLastSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = scan.nextInt();
        System.out.println("Given number is " + a);
        int lastDigit = a % 10;

        while (a > 9) {
            a = a / 10;
        }
        int sum = lastDigit + a;
        System.out.println("The sum is:" + sum);
    }
}
