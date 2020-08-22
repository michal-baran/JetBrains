import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        boolean inOrder = true;

        if (input.length > 1) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] + 1 != input[i + 1]) {
                    inOrder = false;
                }
            }
        }
        System.out.println(inOrder);
    }
}
