import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] arr = new char[4][4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine().toCharArray();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j + 1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}