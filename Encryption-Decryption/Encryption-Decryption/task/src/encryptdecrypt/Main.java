package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder encryption = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] message = sc.nextLine().toCharArray();
        int key = sc.nextInt();
        String alphabet2 = alphabet.substring(key, alphabet.length()) + alphabet.substring(0, key);

        for (char c : message) {
            boolean letterFound = false;
            for (int i = 0; i < alphabet2.length(); i++) {
                if (c == alphabet.charAt(i)) {
                    encryption.append(alphabet2.charAt(i));
                    letterFound = true;
                    break;
                }
            }
            if (!letterFound) {
                encryption.append(c);
            }
        }
        System.out.println(encryption.toString());
    }
}
