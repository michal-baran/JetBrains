import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        String[] arrCopy = new String[arr.length];
        boolean result = true;

        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        Arrays.sort(arrCopy);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrCopy[i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}