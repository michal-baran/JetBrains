import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        StringBuffer password = new StringBuffer();

        for (int i = 0; i < n; i++) {

            boolean isEven = i % 2 == 0;

            if (i < a || i >= a + b + c) {
                if (isEven) {
                    password.append("A");
                } else {
                    password.append("B");
                }

            } else if (i >= a && i < a + b) {
                if (isEven) {
                    password.append("a");
                } else {
                    password.append("b");
                }
            } else if (i >= a + b && i < a + b + c) {
                if (isEven) {
                    password.append(1);
                } else {
                    password.append(2);
                }
            }
        }
        System.out.println(password);
    }
}