import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int value;
        int max = 0;


        for (int i = 0; i < numbers; i++) {
            value = scanner.nextInt();
            if (value % 4 == 0 && max <= value) {
                max = value;
            }
        }
        System.out.println(max);
    }
}