import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int index = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max) {
                index = i;
                max = arr[i];
            }
        }

        System.out.println(index);
    }
}