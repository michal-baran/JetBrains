package bullscows;

import java.util.Scanner;

public class RandomNumber {
    public static String Generate(Scanner sc) {
        System.out.println("Input the length of the secret code:");
        int k = 0;
        int n = 0;
        String input = sc.nextLine();
        try {
            k = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number");
            System.exit(0);
        }
        if (k == 0) {
            System.out.println("Error: Code cannot contain 0 symbols");
            System.exit(0);
        }

        System.out.println("Input the number of possible symbols in the code:");
        input = sc.nextLine();
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number");
            System.exit(0);
        }
        if (n > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }
        if (k > n) {
            System.out.println("Error: it's not possible to generate a code with a length of " + k + " with " + n + " unique symbols.");
            System.exit(0);
        }

        System.out.print("The secret is prepared: ");
        for (
                int i = 0;
                i < k; i++) {
            System.out.print("*");
        }
        if (n <= 10) {
            System.out.print(" (0-" + Character.toString(n + 47) + ")\n");
        } else {
            System.out.print(" (0-9, a-" + Character.toString(n + 86) + ")\n");
        }

        StringBuffer code = new StringBuffer();
        if (k > 36) {
            System.out.println("Error: can't generate a secret number with a length of " + k + " because there aren't enough unique digits.");
        } else {
            //Generate array with symbols
            char[] symbols = new char[n];
            for (int i = 0; i < symbols.length; i++) {
                symbols[i] = (char) (i + (i > 9 ? 87 : 48));
            }

            //Generate k-symbols and write them to the second array
            char[] result = new char[k];
            for (int i = 0; i < result.length; i++) {
                int r = (int) (Math.random() * n);
                code.append(symbols[r]);
                symbols[r] = symbols[n - 1];
                n--;
            }
        }
        return code.toString();
    }
}