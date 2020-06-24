import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int squareValue = 0;
        int i = 0;

        while (true) {
            i++;
            squareValue = i * i;
            if (squareValue > number) {
                break;
            }
            System.out.println(squareValue);
        }
    }
}