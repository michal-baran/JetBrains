import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = n; i <= n * m; i = i + n) {
            if (i == k) {
                System.out.println("YES");
                return;
            }
        }
        for (int i = m; i <= m * n; i = i + m) {
            if (i == k) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}