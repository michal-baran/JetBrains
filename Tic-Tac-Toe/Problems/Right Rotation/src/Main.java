import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        String[] nC = new String[n.length];
        int rot = scanner.nextInt() % n.length;

        System.arraycopy(n, n.length - rot, nC, 0, rot);
        System.arraycopy(n, 0, nC, rot, n.length - rot);

        for (String i : nC) {
            System.out.printf("%s ", i);
        }
    }
}