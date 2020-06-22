import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numbers; i++) {
            int value = scanner.nextInt();
            if (value % 6 == 0) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}