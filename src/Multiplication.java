import java.util.Scanner;

public class Multiplication {
    // this program multiplication table using DO WHILE loop

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scan.nextInt();//
//        System.out.println("Given number is " + a);

        int x = 1;//initial value
        int y;

        do {
            y=1;
            do{
                System.out.print("\t"+x*y);
                y++;
            }while (y<=3);
            System.out.println();
            x++;
        }while (x<=a);
    }
}
