
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int y = 0;
        int z = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                System.out.println("Number of numbers: " + z);
                System.out.println("Sum of the numbers: " + y);
                break;
            } else {
                z = z + 1;
                y = y + x;
                continue;
            }
        }
    }
}
