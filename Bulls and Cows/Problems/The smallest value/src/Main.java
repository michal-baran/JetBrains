import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        int i = 1;

        while (true) {
            BigInteger n = BigInteger.ONE;
            for (int j = 1; j <= i; j++) {
                n = n.multiply(new BigInteger(Integer.toString(j)));
            }
            if (n.compareTo(number) != -1) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }
}