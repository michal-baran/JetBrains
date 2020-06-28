import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int max = 0;

        while (true) {
            if (max == 0) {
                max = value;
            }
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);


    }
}