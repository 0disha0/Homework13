import java.util.Scanner;

public class Range {
// To Print any 10 numbers between given/user input range.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("(To see 10 number rage)\nEnter initial number:");//to start with
        int a = scan.nextInt();
        System.out.println("Enter End of number");// until user wanna print
        int b = scan.nextInt();

        if(a<b){
            for (int i = a; i <=b; i++){//  (variable;condition;change)
                System.out.println(i);
            }
        }else {// if its reverse number
            for (int i = b; i <=a; i++) {
                System.out.println(i);
            }
        }

    }
}
