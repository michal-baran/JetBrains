import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int row = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int seats = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int freeSeats = 0;

            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    freeSeats++;
                } else {
                    freeSeats = 0;
                }
                if (freeSeats >= seats) {
                    break;
                }
            }
            if (freeSeats >= seats) {
                row += i + 1;
                break;
            }
        }
        System.out.println(row);
    }
}
