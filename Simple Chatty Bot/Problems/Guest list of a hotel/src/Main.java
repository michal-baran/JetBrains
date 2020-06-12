//put imports you need here

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
