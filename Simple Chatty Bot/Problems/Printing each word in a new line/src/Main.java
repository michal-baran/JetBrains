import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        words.add(scanner.next());
        words.add(scanner.next());
        words.add(scanner.next());
        words.add(scanner.next());
        words.add(scanner.next());

        for (String word : words) {
            System.out.println(word);
        }
    }
}