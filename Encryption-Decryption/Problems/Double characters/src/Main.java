import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        for (char c : chars) {
            System.out.print(c);
            System.out.print(c);
        }
    }
}