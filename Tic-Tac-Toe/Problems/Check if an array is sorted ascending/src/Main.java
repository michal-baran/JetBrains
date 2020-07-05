import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (i > 0 && arr[i - 1] >= arr[i]) {
                result = false;
            }
        }

        System.out.println(result);

    }
}