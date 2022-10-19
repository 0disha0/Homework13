import java.util.Scanner;

public class NaturalSum {
    // this program to display sum of n Natural number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(To find sum )\nEnter any NO of Term:");
        int a = scan.nextInt();// to input
        int sum =0;

        for (int i = 1; i <= a; i++) {
           sum = sum+i;
        }
        System.out.println("Given number is "+a);
        System.out.println("Addition is "+sum);
    }
}
