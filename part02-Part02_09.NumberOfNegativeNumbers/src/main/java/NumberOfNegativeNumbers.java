
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                System.out.println("Number of negative numbers: " + y);
                break;
            } else if (x < 0) {
                y = y + 1;
                continue;
            }
        }
    }
}
