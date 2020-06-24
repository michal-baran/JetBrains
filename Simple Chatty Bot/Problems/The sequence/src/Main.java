import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int max = 0;
        int value;
        int numbers = scanner.nextInt();

        while (i < numbers) {
            value = scanner.nextInt();
            if (value % 4 == 0 && value > max) {
                max = value;
            }
            i++;
        }
        System.out.println(max);
    }
}