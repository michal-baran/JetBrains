import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}