package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = RandomNumber.Generate(sc);
        Grader.getAnswer(code, sc);
    }
}

