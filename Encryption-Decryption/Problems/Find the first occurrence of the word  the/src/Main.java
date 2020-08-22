import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toLowerCase().toCharArray();

        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 't' & chars[i + 1] == 'h' & chars[i + 2] == 'e') {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}