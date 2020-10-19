package bullscows;

import java.util.Scanner;

public class RandomNumber {
    public static String Generate(Scanner sc) {
        System.out.println("Please, enter the secret code's length:");
        int size = sc.nextInt();
        StringBuffer number = new StringBuffer();

        if (size > 10) {
            System.out.println("Error: can't generate a secret number with a length of " + size + " because there aren't enough unique digits.");
        } else {
            int n = 10;
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i;
            }
            int[] result = new int[size];
            for (int i = 0; i < result.length; i++) {
                int r = (int) (Math.random() * n);
                result[i] = numbers[r];
                numbers[r] = numbers[n - 1];
                n--;
                number.append(result[i]);
            }
        }
        return number.toString();
    }
}

