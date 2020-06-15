import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine().replace(" ", "");
        String word2 = scanner.nextLine().replace(" ", "");
        System.out.println(word1.equals(word2));
    }
}