
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = 0;
        int z = 0;
        double w = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                w = (double) y / z;
                System.out.println("Average of the numbers: " + w);
                break;
            } else {
                z = z + 1;
                y = y + x;
                continue;
            }
        }
    }
}
