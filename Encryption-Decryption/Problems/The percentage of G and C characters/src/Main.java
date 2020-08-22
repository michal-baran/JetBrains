import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char[] sequence = sc.nextLine().toLowerCase().toCharArray();

        for (char letter : sequence) {
            if (letter == 'c' || letter == 'g') {
                count++;
            }
        }
        double result = (double) count / sequence.length * 100.0;
        System.out.println(result);
    }
}