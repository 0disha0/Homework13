import java.util.Scanner;

public class Fibonacci {
    // This program to find the sequence for fibonacci series for given limitation

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//creating new object for scanner class
        System.out.println("Enter start of number:");
        int a = scan.nextInt();// to input
        int x;
        int y=0;
        int z=1;
        System.out.print(z+" ");//1+space

        for(int i=1;i<=a;i++) {//looping until the condition is true
            x = y + z;
            System.out.print(x+" ");
            y = z;
            z = x;
        }
    }
}




