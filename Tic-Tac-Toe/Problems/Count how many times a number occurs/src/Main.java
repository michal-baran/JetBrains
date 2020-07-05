import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int times = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int num = scan.nextInt();

        for (int value : arr) {
            if (value == num) {
                times++;
            }
        }
        System.out.println(times);
    }
}