import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int value = 0;
        int partsReady = 0;
        int partsToFix = 0;
        int partsRejected = 0;

        for (int i = 0; i < n; i++) {
            value = scanner.nextInt();
            if (value == 1) {
                partsToFix++;
            } else if (value == -1) {
                partsRejected++;
            } else if (value == 0) {
                partsReady++;
            }
        }
        System.out.println(partsReady + " " + partsToFix + " " + partsRejected);
    }
}