package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] sign = input.toCharArray();
        System.out.println(sign);
        System.out.println("---------");
        System.out.println("| " + sign[0] + " " + sign[1] + " " + sign[2] + " |");
        System.out.println("| " + sign[3] + " " + sign[4] + " " + sign[5] + " |");
        System.out.println("| " + sign[6] + " " + sign[7] + " " + sign[8] + " |");
        System.out.println("---------");
    }
}
