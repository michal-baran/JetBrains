package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = "";
        File in = new File("");
        File out = new File("");

        // Check arguments
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]) * (mode.equals("dec") ? -1 : 1);
            } else if (args[i].equals("-data")) {
                data = args[i + 1];
                StringBuilder encryption = new StringBuilder();
                char[] message = args[i + 1].toCharArray();
                for (char c : message) {
                    encryption.append((char) (c + key));
                }
                System.out.println(encryption.toString());
            } else if (args[i].equals("-in")) {
                in = new File(args[i + 1]);
            } else if (args[i].equals("-out")) {
                out = new File(args[i + 1]);
            }

            //Check if there are in and out files
            if (!in.getName().equals("") && !out.getName().equals("") && data.equals("")) {
                ArrayList<char[]> inText = new ArrayList<>();
                try {
                    Scanner scan = new Scanner(in);
                    FileWriter writer = new FileWriter(out);

                    while (scan.hasNextLine()) {
                        inText.add(scan.nextLine().toCharArray());
                    }
                    for (char[] ch : inText) {
                        StringBuilder outText = new StringBuilder();
                        for (char c : ch) {
                            outText.append((char) (c + key));
                        }
                        writer.write(outText.toString());
                    }
                    writer.close();
                    scan.close();
                } catch (IOException e) {
                    System.out.printf("An exception occurs %s", e.getMessage());
                }
            }
        }
    }
}
