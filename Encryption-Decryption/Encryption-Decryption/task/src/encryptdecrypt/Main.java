package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = "";

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")) {
                data = args[i + 1];
            }
        }
        char[] message = data.toCharArray();

        StringBuilder encryption = new StringBuilder();

        if (mode.equals("dec")) {
            key = -key;
        }

        for (char c : message) {
            encryption.append((char) (c + key));
        }
        System.out.println(encryption.toString());
    }
}