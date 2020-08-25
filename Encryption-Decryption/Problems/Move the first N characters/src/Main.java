import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = s.repeat(2);
        int n = sc.nextInt();

        if (n <= s.length()) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(ss.charAt(n + i));
            }
        } else {
            System.out.println(s);
        }
    }
}