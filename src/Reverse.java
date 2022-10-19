import java.util.Scanner;

public class Reverse {
// to find the reverse number of 5 digit

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 digit number:");
        int a = scan.nextInt();
        System.out.println("Given number is "+a);
        System.out.print("reverse number is ");
        int reverse;

        while(a>0){//12345>0
            reverse =a%10;//5 || 543..
            System.out.print(reverse);
            a=a/10;//1234
        }
    }
}
