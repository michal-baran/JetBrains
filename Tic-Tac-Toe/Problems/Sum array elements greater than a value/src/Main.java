import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int n = scan.nextInt();

        for (int value : arr) {
            if (value > n) {
                sum += value;
            }
        }

        System.out.println(sum);
    }
}