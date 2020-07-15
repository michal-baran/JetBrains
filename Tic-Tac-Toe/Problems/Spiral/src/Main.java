import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] arr = new int[size][size];
        int value = 1;
        int v = 0;
        int h = 0;

        while (size > 0) {
            //Iterate right
            for (int i = 0; i < size - 1; i++) {
                arr[v][h++] = value;
                value++;
            }

            //Iterate down
            for (int i = 0; i < size - 1; i++) {
                arr[v++][h] = value;
                value++;
            }

            //Iterate left
            for (int i = 0; i < size - 1; i++) {
                arr[v][h--] = value;
                value++;
            }

            //Iterate up
            for (int i = 0; i < size - 1; i++) {
                arr[v--][h] = value;
                value++;
            }
            h++;
            v++;
            size -= 2;
        }
        if (size < 0) {
            arr[v - 1][h - 1] = value;
        }
        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}