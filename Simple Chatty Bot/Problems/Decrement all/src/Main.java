import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            numbers.add(scanner.nextInt());
            numbers.set(i, numbers.get(i) - 1);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}