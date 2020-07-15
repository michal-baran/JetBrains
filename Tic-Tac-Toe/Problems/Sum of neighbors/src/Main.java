import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> lines = new ArrayList<>();
        String input = new String();

        while (true) {
            input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                lines.add(input.split(" "));
            }
        }
        //New int array
        int[][] arr = new int[lines.size()][lines.get(0).length];
        int[][] arrSum = new int[lines.size()][lines.get(0).length];

        //Convert string array into int array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(lines.get(i)[j]);
            }
        }

        //Sum neighbours
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int left = j - 1;
                int right = j + 1;
                int up = i - 1;
                int down = i + 1;

                if (j - 1 < 0) {
                    left = arr[0].length - 1;
                }
                if (j + 1 > arr[0].length - 1) {
                    right = 0;
                }
                if (i - 1 < 0) {
                    up = arr.length - 1;
                }
                if (i + 1 > arr.length - 1) {
                    down = 0;
                }
                arrSum[i][j] = arr[up][j] + arr[down][j] + arr[i][left] + arr[i][right];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}