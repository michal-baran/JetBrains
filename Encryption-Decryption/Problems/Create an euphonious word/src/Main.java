import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiouy";
        StringBuffer emptyWord = new StringBuffer("");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    isVowel = true;
                }
            }
            if (isVowel) {
                emptyWord.append(1);
            } else {
                emptyWord.append(0);
            }
        }

        int count = 0;
        int max = 0;
        for (int k = 0; k < emptyWord.length() - 1; k++) {
            if (emptyWord.charAt(k) == emptyWord.charAt(k + 1)) {
                count++;
            } else {
                count = 0;
            }
            if (count >= 2) {
                count = 0;
                max++;
            }
        }
        System.out.println(max);
    }
}