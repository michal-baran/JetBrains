import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long total = 1;

        for (int i = a; i < b; i++) {
            total *= i;
        }
        System.out.println(total);
    }

}