import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer result = new StringBuffer();
        boolean isEven = input.length() % 2 == 0;
        int halfsize = (input.length() - 1) / 2;

        for (int i = 0; i < input.length(); i++) {
            if (!isEven && i == halfsize) {
                continue;
            } else if (isEven && (i == halfsize || i == halfsize + 1)) {
                continue;
            }
            result.append(input.charAt(i));
        }
        System.out.println(result);
    }
}