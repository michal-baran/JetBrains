package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder encryption = new StringBuilder();

        String operation = sc.nextLine();
        char[] message = sc.nextLine().toCharArray();
        int key = sc.nextInt();
        if (operation.equals("dec")) {
            key = -key;
        }

        for (char c : message) {
            encryption.append((char) (c + key));
        }
        System.out.println(encryption.toString());
    }
}
