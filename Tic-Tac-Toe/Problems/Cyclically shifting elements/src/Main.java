import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int[] arrCopy = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.arraycopy(arr, 0, arrCopy, 1, size - 1);
        System.arraycopy(arr, size - 1, arrCopy, 0, 1);
        for (int value : arrCopy) {
            System.out.print(value + " ");
        }
    }
}