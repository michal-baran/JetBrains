import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (i > 0 && arr[i] < min) {
                min = arr[i];
            } else if (i == 0) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}