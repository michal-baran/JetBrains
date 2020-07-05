import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] n = new int[size];
        boolean result = false;

        for (int i = 0; i < size; i++) {
            n[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();

        for (int value : n) {
            if (value == number) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}