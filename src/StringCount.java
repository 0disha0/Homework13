import java.util.Scanner;

public class StringCount {
    // to enter any String and count total numbers of 'a' in that String

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(To count any string 'A')\nEnter any string:");
        String s = scan.nextLine();// to get user input
        int count = 1;
        int countA = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a'||s.charAt(j) == 'A') {// checking each character and increasing count value
                countA++;
            }
        }
        System.out.println("given string is ' "+s+"'\nTotal 'A' :"+countA);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
            System.out.println("Total characters :" + count);
    }
}