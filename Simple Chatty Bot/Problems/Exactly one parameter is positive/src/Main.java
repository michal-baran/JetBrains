import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean positiveA = a > 0 && b <= 0 && c <= 0;
        boolean positiveB = b > 0 && a <= 0 && c <= 0;
        boolean positiveC = c > 0 && a <= 0 && b <= 0;

        System.out.println(positiveA || positiveB || positiveC);
    }
}