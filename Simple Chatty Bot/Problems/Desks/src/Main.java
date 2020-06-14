import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        int sum = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n / 2;
            } else {
                sum += n / 2 + 1;
            }
        }
        System.out.println(sum);
    }
}