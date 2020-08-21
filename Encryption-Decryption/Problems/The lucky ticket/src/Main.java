import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int value1 = 0;
        int value2 = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i < 3) {
                value1 += input.charAt(i);
            } else {
                value2 += input.charAt(i);
            }
        }
        System.out.println(value1 == value2 ? "Lucky" : "Regular");
    }
}