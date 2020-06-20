import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number / 1000;
        int b = number % 1000 / 100 * 10;
        int c = number % 100 / 10 * 100;
        int d = number % 10 * 1000;
        int reversedNumber = a + b + c + d;

        if (number == reversedNumber) {
            System.out.println(1);
        } else {
            System.out.println(22);
        }
    }
}