import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        int i = 0;

        while (n <= m) {
            i++;
            n *= i;
        }

        System.out.println(i);
    }
}