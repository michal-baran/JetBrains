import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;

        while (true) {
            value = scanner.nextInt();
            sum += value;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (value == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}