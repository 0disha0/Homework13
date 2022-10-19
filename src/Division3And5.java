import java.util.Scanner;

public class Division3And5 {
    //This program to print the numbers between 1-100 which can be divided by 3 and 5 separately

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(To find can be divided by 3&5)\nEnter any start number of range :");
        int a = scan.nextInt();// to input
        System.out.println("Enter End number of range");// until user want to find
        int b = scan.nextInt();

        System.out.println("\nNumbers divisible by 3");
        System.out.print("( ");
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");// make it clear
            }
        }
        System.out.print(")");
        System.out.println();// for space
        System.out.println("Numbers divisible by 5");
        System.out.print("( ");
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.print(")");
        System.out.println();
        System.out.println("Numbers divisible by 3&5");
        System.out.print("( ");
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5==0) {// to run both one time
                System.out.print(i + ",");
            }
        }System.out.print(")");

    }
}
