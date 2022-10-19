import java.util.Scanner;

public class Table {
    // this program to print multiplication table for given number (for loop)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(To find table of any number)\nEnter any number:");
        int a = scan.nextInt();// to input

        for(int i=1; i<=10; i++){
            System.out.println(a+"*"+i+"= "+ a * i);// 1*1to10=1*1to10
        }

    }
}
