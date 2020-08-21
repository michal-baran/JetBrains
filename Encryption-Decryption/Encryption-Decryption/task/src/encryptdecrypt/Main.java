package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = letters.toCharArray();
        char[] reverse = new char[alphabet.length];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = alphabet[alphabet.length - (1 + i)];
        }

        StringBuilder encryption = new StringBuilder();
        char[] message = ("we found a treasure!").toCharArray();

        for (char c : message) {
            boolean letterFound = false;
            for (int j = 0; j < alphabet.length; j++) {
                if (c == alphabet[j]) {
                    encryption.append(reverse[j]);
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
