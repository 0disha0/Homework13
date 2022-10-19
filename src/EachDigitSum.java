import java.util.Scanner;

public class EachDigitSum {
//this program to input any 5-digit number and then to find sum of each digit

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 digit number:");
        int a = scan.nextInt();
        System.out.println("Given number is "+a);
        int x,sum=0;

        while(a>0) {//12345>0
            x = a % 10;
            sum = sum + x;
            a = a / 10;
        }
        System.out.println("The sum of each digit :"+sum);// printout

    }
}
