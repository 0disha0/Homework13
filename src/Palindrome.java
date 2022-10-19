import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = scan.nextInt();
        System.out.println("Given number is "+a);
        int r,y,x=0;//initialising int variable
        y=a;

        while(a>0){//checking the condition
            r=a%10;
            x=(x*10)+r;
            a=a/10;
        }
        if(y==x)//if the condition is true
            System.out.println("It's a palindrome number");
        else
            System.out.println("It's not a palindrome number");
    }
}
