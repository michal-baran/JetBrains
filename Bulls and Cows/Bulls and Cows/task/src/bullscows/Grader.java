package bullscows;

import java.util.Scanner;

public class Grader {
    public static void getAnswer(String code, Scanner sc) {
        int turns = 0;
        System.out.println("Okay, let's start a game!\n");
        char[] codeChar = code.toCharArray();

        while (true) {
            turns++;
            System.out.println("Turn " + turns + ":");
            char[] answer = sc.nextLine().toCharArray();
            int cows = 0;
            int bulls = 0;
            for (int i = 0; i < codeChar.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (codeChar[i] == answer[j]) {
                        if (i == j) {
                            bulls++;
                        } else {
                            cows++;
                        }
                    }
                }
            }
            if (bulls > 0) {
                if (cows > 0) {
                    System.out.println("Grade: " + bulls + (bulls > 1 ? " bulls" : " bull") + " and " + cows + (cows > 1 ? " cows" : " cow") + ".");
                } else {
                    System.out.println("Grade: " + bulls + (bulls > 1 ? " bulls" : " bull") + ".");
                }
            } else if (cows > 0) {
                System.out.println("Grade: " + cows + (cows > 1 ? " cows" : " cow") + ".");
            } else {
                System.out.println("Grade: None.");
            }
            if (bulls == codeChar.length) {
                System.out.println("Congratulations! You guessed the secret code.");
                return;
            }
        }
    }
}