import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dnaCode = sc.nextLine();

        StringBuffer shortDNA = new StringBuffer("");
        int count = 0;
        char prevChar = dnaCode.charAt(0);

        for (int i = 0; i < dnaCode.length(); i++) {

            if (dnaCode.charAt(i) == prevChar) {
                count++;
            } else {
                shortDNA.append(prevChar);
                shortDNA.append(count);
                count = 1;
            }
            prevChar = dnaCode.charAt(i);
        }
        shortDNA.append(prevChar);
        shortDNA.append(count);
        System.out.println(shortDNA.toString());
    }
}