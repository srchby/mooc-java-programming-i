
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                System.out.println("Sum of the numbers: " + y);
                break;
            } else {
                y = y + x;
                continue;
            }
        }
    }
}
