import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();

        int seed = k;
        while (true) {
            Random rand = new Random(seed);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (rand.nextGaussian() > m) {
                    break;
                }
                count++;
            }
            if (count == n) {
                break;
            }
            seed++;
        }
        System.out.println(seed);
    }
}