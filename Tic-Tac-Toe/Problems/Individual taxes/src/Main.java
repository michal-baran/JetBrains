import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int companies = scan.nextInt();
        int[] income = new int[companies];
        int[] taxRate = new int[companies];
        int[] tax = new int[companies];
        int maxTax = 0;
        int index = 0;

        for (int i = 0; i < companies; i++) {
            income[i] = scan.nextInt();
        }

        for (int i = 0; i < companies; i++) {
            taxRate[i] = scan.nextInt();
            tax[i] = income[i] * taxRate[i];
            if (tax[i] > maxTax) {
                maxTax = tax[i];
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}