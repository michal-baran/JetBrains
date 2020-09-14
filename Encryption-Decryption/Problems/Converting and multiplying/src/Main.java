import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        while (true) {
            String in = sc.nextLine();
            if ("0".equals(in)) {
                break;
            }
            array.add(in);
        }

        for (String s : array) {
            try {
                System.out.println(Integer.parseInt(s) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }
}