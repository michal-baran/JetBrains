import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        int[][] swappedArr = new int[n][m];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                arr[a][b] = scan.nextInt();
            }
        }

        int i = scan.nextInt();
        int j = scan.nextInt();

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                if (b == i) {
                    System.out.print(arr[a][j] + " ");
                } else if (b == j) {
                    System.out.print(arr[a][i] + " ");
                } else {
                    System.out.print(arr[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}