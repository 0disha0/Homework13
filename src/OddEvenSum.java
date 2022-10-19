import java.util.Scanner;

public class OddEvenSum {
    //This program to input any 5-digit number and then count total number of odd and even digit and find out sum
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 digit number:");
        int a = scan.nextInt();// to get user input
        System.out.println("Given number is " + a);
        int even=0;//int variable declaring and assigning
        int odd=0;
        int r;
        int sum=0;
        int sum1=0;

        while(a>0){//to even
            r=a%10;
            if(r%2==0) {
                even++;
            }else {//to odd
                odd++;
            }a=a/10;
            sum=sum+even;//sum even
            sum1=sum1+odd;//sum odd
        }
        System.out.println("Total Even :"+even);
        System.out.println("the sum of Even Digit :"+sum);
        System.out.println("Total Odd :"+odd);
        System.out.println("The sum of Odd Digit :"+sum1);
    }
}


