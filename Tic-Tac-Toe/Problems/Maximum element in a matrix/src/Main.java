import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;
        int[][] arr = new int[n][m];
        int[] indexes = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                if (i == 0 && j == 0 || arr[i][j] > max) {
                    indexes[0] = i;
                    indexes[1] = j;
                    max = arr[i][j];
                }
            }
        }

        System.out.println(indexes[0] + " " + indexes[1]);
    }
}