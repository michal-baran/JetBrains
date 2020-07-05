import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int actSize = 1;
        int prevSize = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                actSize++;
            } else {
                actSize = 1;
            }
            if (actSize > prevSize) {
                prevSize = actSize;
            }
        }
        System.out.println(prevSize);
    }
}