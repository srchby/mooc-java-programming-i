
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                System.out.println("Number of numbers: " + y);
                break;
            } else {
                y = y + 1;
                continue;
            }
        }
    }
}
