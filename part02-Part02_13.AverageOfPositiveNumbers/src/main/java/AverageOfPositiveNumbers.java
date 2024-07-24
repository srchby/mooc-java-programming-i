
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
                if (x == 0 && y == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(w);
                break;
            } else if (x > 0){
                z = z + 1;
                y = y + x;
                continue;
            } else {
                continue;
            }
        }
    }
}
