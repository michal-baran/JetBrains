import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int min = k;
        int seed = 0;

        for (int i = a; i <= b; i++) {
            int max = 0;
            int value = 0;
            Random rand = new Random(i);

            for (int j = 0; j < n; j++) {
                value = rand.nextInt(k);
                max = Math.max(max, value);
            }
            if (max < min) {
                min = max;
                seed = i;
            }
        }
        System.out.println(seed);
        System.out.println(min);
    }
}