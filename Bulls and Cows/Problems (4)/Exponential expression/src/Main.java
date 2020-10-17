import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble();
        System.out.println(Math.pow(x, 3.0) + Math.pow(x, 2.0) + x + 1.0);
    }
}