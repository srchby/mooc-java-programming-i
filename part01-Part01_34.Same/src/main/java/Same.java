
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String txt1 = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        String txt2 = String.valueOf(scan.nextLine());
        if (txt1.equals(txt2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
