import java.util.Scanner;

public class PrimeNumber {
// to check given number is prime or not

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check :");
        int x = scan.nextInt();
        int y = 0;

        for (int i = 1; i <=x; i++) {//(
            if (x % i ==0) {
                y++;//==1
            }
        }
        if (y == 2)
            System.out.println(x + " is a prime number");
        else
            System.out.println(x + " is not prime number");
    }


}


