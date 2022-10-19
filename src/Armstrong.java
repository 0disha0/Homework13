import java.util.Scanner;

public class Armstrong {
// This program to input any number and find out if its Armstrong number or not?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = scan.nextInt();// to get user input
        System.out.println("Given number is "+a);
        int r,sum=0;
        int temp =a;

        while(a>0){// to check condition
            r=a%10;
            a=a/10;
            sum=sum+r*r*r;
        }
        if(temp==sum) {// checking if the sum and original number are equal
            System.out.println("It's an Armstrong number");
        }else {
            System.out.println("It's not an Armstrong number");
        }
    }
}
