import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println((double) sum / count);
    }
}