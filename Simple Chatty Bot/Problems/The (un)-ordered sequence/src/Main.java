import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int prevValue = 0;
        boolean descendingOrder = true;
        boolean ascendingOrder = true;

        while (true) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (prevValue == 0) {
                prevValue = value;
            } else if (prevValue > value) {
                ascendingOrder = false;
            } else if (prevValue < value) {
                descendingOrder = false;
            }
            prevValue = value;

        }
        System.out.println(ascendingOrder || descendingOrder);
    }
}