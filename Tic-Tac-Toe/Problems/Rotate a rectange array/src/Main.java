import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = scan.nextInt();
                arr2[j][(a - 1) - i] = arr1[i][j];
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}