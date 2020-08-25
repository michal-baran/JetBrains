import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String sentence = sc.nextLine();

        System.out.println((input.length() - input.replaceAll(sentence, "").length()) / sentence.length());
    }
}