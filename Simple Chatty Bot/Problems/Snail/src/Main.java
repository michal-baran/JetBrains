import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 1;
        int remainingHeight = h;

        while (true) {
            remainingHeight -= a;
            if (remainingHeight <= 0) {
                break;
            }
            remainingHeight += b;
            days++;
        }
        System.out.println(days);
    }
}