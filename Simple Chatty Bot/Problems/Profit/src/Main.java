import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;

        while (m < k) {
            years++;
            m = m * (1 + (float) p / 100);
        }
        System.out.println(years);
    }
}