import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        while (true) {
            i++;
            if (n / i == 0) {
                if (i % 2 != 0) {
                    i += 1;
                }
                break;
            }
        }
        System.out.println(i);
    }
}